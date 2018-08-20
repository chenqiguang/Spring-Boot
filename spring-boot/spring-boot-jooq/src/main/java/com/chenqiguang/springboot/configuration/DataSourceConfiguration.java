// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DataSourceConfiguration.java

package com.chenqiguang.springboot.configuration;

import com.alibaba.druid.pool.DruidDataSource;
import com.chenqiguang.springboot.Common.tools.DataSourceTools;
import org.apache.commons.lang.math.NumberUtils;
import org.jooq.*;
import org.jooq.conf.Settings;
import org.jooq.impl.DataSourceConnectionProvider;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.jooq.JooqProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DatabaseDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

// Referenced classes of package com.xforceplus.xplat.configuration.jooq:
// SpringTransactionProvider,
// JooqExceptionTranslator,
// JooqReadonlyExecuteListener,
// JooqAutoLimitExecuteListener,
// JooqUpdateOrDeleteWithoutWhereListener
@Configuration
public class DataSourceConfiguration {
    private static final String PRIMARY_DATASOURCE = "spring.datasource";
    private static final String PRIMARY_MAXACTIVE = "spring.datasource.tomcat.max-active";
    private static final String PRIMARY_INITPOOLSIZE = "spring.datasource.tomcat.initial-size";
    private static final String PRIMARY_JDBC_URL = "spring.datasource.url";
    private static final String SECOND_DATASOURCE = "spring.secondDatasource";
    private static final String SECOND_MAXACTIVE = "spring.secondDatasource.tomcat.max-active";
    private static final String SECOND_INITPOOLSIZE = "spring.secondDatasource.tomcat.initial-size";
    private static final String SECOND_JDBC_URL = "spring.secondDatasource.url";
    private static final int DEFAULT_MAXACTIVE = 100;
    private static final int DEFAULT_INITSIZE = 10;
    private static final String READONLY = "spring.secondDatasource.read-only";

    @Autowired
    private Environment environment;
    @Autowired
    private DataSourceTools dataSourceTools;
    public DataSourceConfiguration() {}


    @Primary
    @Bean(name = {"dataSource"})
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        String dataSourceType = environment.getProperty("spring.datasource.type");
        if (dataSourceType!=null && "com.alibaba.druid.pool.DruidDataSource".equals(dataSourceType)){
            DruidDataSource druidDataSource = new DruidDataSource();
            return dataSourceTools.dataSource(druidDataSource);
        }else {
            org.apache.tomcat.jdbc.pool.DataSource tomcatDataSource = (org.apache.tomcat.jdbc.pool.DataSource) DataSourceBuilder.create().build();
            return dataSourceTools.dataSource(tomcatDataSource);
        }
    }

    @Primary
    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    @Primary
    @Bean
    @ConditionalOnMissingBean({DataSourceConnectionProvider.class})
    public DataSourceConnectionProvider dataSourceConnectionProvider(DataSource dataSource) {
        return new DataSourceConnectionProvider(new TransactionAwareDataSourceProxy(dataSource));
    }

    @Primary
    @Bean
    @ConditionalOnBean({PlatformTransactionManager.class})
    public SpringTransactionProvider transactionProvider(PlatformTransactionManager txManager){
        return new SpringTransactionProvider(txManager);
    }

    @Configuration
    @ConditionalOnMissingBean({DSLContext.class})
    @EnableConfigurationProperties({JooqProperties.class})
    public static class DslContextConfiguration {
        private final JooqProperties properties;
        private final ConnectionProvider connectionProvider;
        private final TransactionProvider transactionProvider;
        private final RecordMapperProvider recordMapperProvider;
        private final Settings settings;
        private final RecordListenerProvider[] recordListenerProviders;
        private final ExecuteListenerProvider[] executeListenerProviders;
        private final VisitListenerProvider[] visitListenerProviders;

        public DslContextConfiguration(JooqProperties properties, ConnectionProvider connectionProvider, ObjectProvider<TransactionProvider> transactionProviderProvider, ObjectProvider<RecordMapperProvider> recordMapperProviderProvider, ObjectProvider<Settings> settingsProvider, ObjectProvider<RecordListenerProvider[]> recordListenerProvidersProvider, ExecuteListenerProvider[] executeListenerProviders, ObjectProvider<VisitListenerProvider[]> visitListenerProvidersProvider) {
            this.properties = properties;
            this.connectionProvider = connectionProvider;
            this.transactionProvider = (TransactionProvider)transactionProviderProvider.getIfAvailable();
            this.recordMapperProvider = (RecordMapperProvider)recordMapperProviderProvider.getIfAvailable();
            this.settings = (Settings)settingsProvider.getIfAvailable();
            this.recordListenerProviders = (RecordListenerProvider[])recordListenerProvidersProvider.getIfAvailable();
            this.executeListenerProviders = executeListenerProviders;
            this.visitListenerProviders = (VisitListenerProvider[])visitListenerProvidersProvider.getIfAvailable();
        }

        @Bean
        @Primary
        public DefaultDSLContext dslContext(org.jooq.Configuration configuration) {
            return new DefaultDSLContext(configuration);
        }

        @Bean
        @Primary
        public DefaultConfiguration jooqConfiguration() {
            DefaultConfiguration configuration = new DefaultConfiguration();
            if (this.properties.getSqlDialect() != null) {
                configuration.set(this.properties.getSqlDialect());
            }else {
                configuration.setSQLDialect(SQLDialect.MYSQL);//默认使用mysql方言
            }

            configuration.set(this.connectionProvider);
            if (this.transactionProvider != null) {
                configuration.set(this.transactionProvider);
            }

            if (this.recordMapperProvider != null) {
                configuration.set(this.recordMapperProvider);
            }

            if (this.settings != null) {
                configuration.set(this.settings);
            }

            configuration.set(this.recordListenerProviders);
            configuration.set(this.executeListenerProviders);
            configuration.set(this.visitListenerProviders);
            return configuration;
        }
    }


}

package com.chenqiguang.springboot.Common.tools;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.google.common.collect.Maps;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DatabaseDriver;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Component
public class DataSourceTools {
    @Autowired
    private  Environment environment;

    /**
     * 处理druid的数据源
     type: com.alibaba.druid.pool.DruidDataSource
     #   启用type为druid是使用数据源其他配置
     initialSize: 5
     minIdle: 5
     maxActive: 20
     maxWait: 60000
     timeBetweenEvictionRunsMillis: 60000
     minEvictableIdleTimeMillis: 300000
     validationQuery: SELECT 1 FROM DUAL
     testWhileIdle: true
     testOnBorrow: false
     testOnReturn: false
     poolPreparedStatements: true
     #   配置监控统计拦截的filters，去掉后监控界面sql无法统计，'wall'用于防火墙
     filters: stat,wall,log4j
     maxPoolPreparedStatementPerConnectionSize: 20
     useGlobalDataSourceStat: true
     connectionProperties: druid.stat.mergeSql=true;druid.stat.slowSqlMillis=500
     * @param druidDataSource
     * @return
     */
    public DataSource dataSource(com.alibaba.druid.pool.DruidDataSource druidDataSource){
        int maxActive = NumberUtils.isNumber(environment.getProperty("spring.datasource.tomcat.max-active")) ? Integer.valueOf(environment.getProperty("spring.datasource.tomcat.max-active")).intValue() : 100;
        int initSize = NumberUtils.isNumber(environment.getProperty("spring.datasource.tomcat.initial-size")) ? Integer.valueOf(environment.getProperty("spring.datasource.tomcat.initial-size")).intValue() : 10;
        DatabaseDriver databaseDriver = DatabaseDriver.fromJdbcUrl(environment.getProperty("spring.datasource.url"));
        String validationQuery = databaseDriver.getValidationQuery();
        if(validationQuery != null) {
            druidDataSource.setTestOnBorrow(true);
            druidDataSource.setValidationQuery(validationQuery);
        }
        druidDataSource.setMaxActive(maxActive);
        druidDataSource.setInitialSize(initSize);
        return druidDataSource;
    }

    /**
     * tomcatDataSource
     * @param tomcatDataSource
     * @return
     */
    public DataSource dataSource(org.apache.tomcat.jdbc.pool.DataSource tomcatDataSource){
        int maxActive = NumberUtils.isNumber(environment.getProperty("spring.datasource.tomcat.max-active")) ? Integer.valueOf(environment.getProperty("spring.datasource.tomcat.max-active")).intValue() : 100;
        int initSize = NumberUtils.isNumber(environment.getProperty("spring.datasource.tomcat.initial-size")) ? Integer.valueOf(environment.getProperty("spring.datasource.tomcat.initial-size")).intValue() : 10;
        DatabaseDriver databaseDriver = DatabaseDriver.fromJdbcUrl(environment.getProperty("spring.datasource.url"));
        String validationQuery = databaseDriver.getValidationQuery();
        if(validationQuery != null) {
            tomcatDataSource.setTestOnBorrow(true);
            tomcatDataSource.setValidationQuery(validationQuery);
        }
        tomcatDataSource.setMaxActive(maxActive);
        tomcatDataSource.setInitialSize(initSize);
        return tomcatDataSource;
    }

    /**
     * 配置druid的监控,管理后台的servlet
     * @return
     */
    @Bean
    @ConditionalOnProperty(name = "spring.datasource.type", havingValue = "com.alibaba.druid.pool.DruidDataSource", matchIfMissing = false)
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        HashMap<String, String> initParam = Maps.newHashMap();
        initParam.put("loginUsername","admin");
        initParam.put("loginPassword","123456");
        initParam.put("allow","");
        initParam.put("deny","10.50.0.204");
        bean.setInitParameters(initParam);

        return bean;
    }

    /**
     * 配置一个web监控的Filter
     * @return
     */
    @Bean
    @ConditionalOnProperty(name = "spring.datasource.type", havingValue = "com.alibaba.druid.pool.DruidDataSource", matchIfMissing = false)
    public FilterRegistrationBean webStatFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());
        HashMap<String, String> initParam = Maps.newHashMap();
        initParam.put("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        bean.setInitParameters(initParam);
        bean.setUrlPatterns(Arrays.asList("/*"));
        return bean;
    }


}

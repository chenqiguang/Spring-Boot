package com.chenqiguang.springboot.configuration;

import org.jooq.ExecuteListenerProvider;
import org.jooq.impl.DefaultExecuteListenerProvider;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JooqConfigurations {
    public JooqConfigurations() {}

    @Bean
    public ExecuteListenerProvider jooqPrependContextExecuteListenerProvider(JooqPrependContextExecuteListener jooqPrependContextExecuteListener) {
        return new DefaultExecuteListenerProvider(jooqPrependContextExecuteListener);
    }

    @Bean
    public ExecuteListenerProvider jooqAutoLimitExecuteListenerProvider(JooqAutoLimitExecuteListener jooqAutoLimitExecuteListener) {
        return new DefaultExecuteListenerProvider(jooqAutoLimitExecuteListener);
    }

    @Bean
    public ExecuteListenerProvider jooqUpdateOrDeleteWithoutWhereListenerProvider(JooqUpdateOrDeleteWithoutWhereListener jooqUpdateOrDeleteWithoutWhereListener) {
        return new DefaultExecuteListenerProvider(jooqUpdateOrDeleteWithoutWhereListener);
    }
}

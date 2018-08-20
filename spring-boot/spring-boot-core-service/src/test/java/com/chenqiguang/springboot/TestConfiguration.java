package com.chenqiguang.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;


@SpringBootConfiguration
//@EnableAspectJAutoProxy(exposeProxy = true)
//@EnableConfigurationProperties({OSSSettings.class, SalesBillSettings.class, EmailSettings.class, VerifySettings.class, ServiceClientSettings.class})
@ComponentScan(value = {"com.chenqiguang.springboot"})
@EnableAutoConfiguration
//@EnableAsync
//@EnableRetry
public class TestConfiguration {

//    @Autowired
//    ServiceClientProxyCreator creator;

//    @Bean
//    public DataSource dataSource() {
//
//        return new EmbeddedDatabaseBuilder()
//                .setType(EmbeddedDatabaseType.H2)
//                .addScript("classpath:script/schema/athena_t_preinvoice.sql")
//                .addScript("classpath:script/data/data-h2.sql")
//                .build();
//    }
}

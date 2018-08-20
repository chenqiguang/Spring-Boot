package com.chenqiguang.springboot.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;

@SpringBootApplication
@MapperScan(value = {"com.chenqiguang.springboot.mybatis.mapper"})
@ComponentScan(value = {"com.chenqiguang.springboot.mybatis" })
public class SpringbootMyBatisAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootMyBatisAppApplication.class,args);
    }
}

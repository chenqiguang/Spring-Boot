package com.chenqiguang.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.chenqiguang.springboot")
public class SpringBootAppApplicationService {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAppApplicationService.class,args);
    }
}

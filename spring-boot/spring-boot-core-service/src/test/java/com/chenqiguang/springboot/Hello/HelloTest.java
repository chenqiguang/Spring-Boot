package com.chenqiguang.springboot.Hello;

import com.chenqiguang.springboot.BaseUnitTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;

public class HelloTest extends BaseUnitTest {

    @Autowired
    DataSource dataSource;
    @Test
    public void testDataSource(){

        System.out.println(dataSource.getClass());
        System.out.println(dataSource.toString());
    }
}

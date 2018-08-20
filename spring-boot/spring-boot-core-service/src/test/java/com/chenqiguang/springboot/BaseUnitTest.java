package com.chenqiguang.springboot;

import com.chenqiguang.springboot.hello.HelloService;
import org.jooq.DSLContext;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.NONE, classes = TestConfiguration.class)
@RunWith(SpringRunner.class)
@ActiveProfiles("unittest")
public class BaseUnitTest {

    @Autowired
    protected DSLContext create;

}

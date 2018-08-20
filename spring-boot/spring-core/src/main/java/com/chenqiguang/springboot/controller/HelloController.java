package com.chenqiguang.springboot.controller;

import com.chenqiguang.springboot.Response;
import com.chenqiguang.springboot.domain.jooq.Tables;
import com.chenqiguang.springboot.domain.jooq.tables.pojos.TSettlementObj;
import com.chenqiguang.springboot.hello.HelloService;
import com.chenqiguang.springboot.spec.api.HelloApi;
import com.chenqiguang.springboot.spec.model.Hello;
import io.swagger.annotations.ApiParam;
import org.jooq.DSLContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@EnableScheduling
public class HelloController implements HelloApi{

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    @Autowired
    private HelloService helloService;

    @Override
    public Response getHello(@NotNull @ApiParam(value = "金钱", required = true) @RequestParam(value = "money", required = true) String money, @ApiParam(value = "hello" ,required=true ) @RequestBody Hello hello) {
        return helloService.getHello(money, hello);
    }

    @GetMapping("/cache/{settlementId}")
    @Cacheable(value = "settlement")
    public TSettlementObj getSettlementById(@PathVariable(value = "settlementId") String settlementId){
        logger.info("查询结算单");

        return helloService.getSettlementById(settlementId);
    }


    @GetMapping("/cache/cacheEvict")
    @CacheEvict(cacheNames = {"settlement"},allEntries = true)
    @Scheduled(fixedRate = 20000)
    public void cacheEvict(){logger.info("清空所有缓存");}
}

package com.chenqiguang.springboot.mybatis.controller;

import com.chenqiguang.springboot.mybatis.bean.Settlement;
import com.chenqiguang.springboot.mybatis.mapper.SettlementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class SettlementController {
    @Autowired
    private SettlementMapper settlementMapper;
    @Autowired
    private DataSource dataSource;
    @GetMapping("/mybatis/{settlementId}")
    public Settlement getSettlement(@PathVariable("settlementId") String settlementId){
        System.out.println(dataSource);
       return settlementMapper.getSettlement(settlementId);
    }

    @GetMapping("/settlement/{settlementId}")
    public Settlement getSettlementById(@PathVariable("settlementId") String settlementId){
        System.out.println(dataSource);
        return settlementMapper.getSettlementById(settlementId);
    }
}

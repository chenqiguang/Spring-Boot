package com.chenqiguang.springboot.hello;

import com.chenqiguang.springboot.Response;
import com.chenqiguang.springboot.domain.jooq.tables.pojos.TSettlementObj;
import com.chenqiguang.springboot.spec.model.Hello;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface HelloService {
    Response getHello(String money, Hello hello);


    TSettlementObj getSettlementById(@PathVariable(value = "settlementId") String id);
}

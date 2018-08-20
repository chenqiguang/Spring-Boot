package com.chenqiguang.springboot.hello;

import com.chenqiguang.springboot.Response;
import com.chenqiguang.springboot.domain.jooq.Tables;
import com.chenqiguang.springboot.domain.jooq.tables.pojos.TSettlementObj;
import com.chenqiguang.springboot.spec.model.Hello;
import org.jooq.DSLContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.GetMapping;

import javax.sql.DataSource;
import java.util.List;

@Service
public class HelloServiceImpl implements HelloService {
    private static final Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Autowired
    private DSLContext create;
    @Autowired
    private DataSource dataSource;
    @Override
    public Response getHello(String money, Hello hello) {
        List<String> list = create.select(Tables.T_SETTLEMENT.SETTLEMENT_ID).from(Tables.T_SETTLEMENT).fetchInto(String.class);
//        create.update(Tables.T_SETTLEMENT).set(Tables.T_SETTLEMENT.EXT9,"").where(true).execute();
        return null;
    }

    @Override
    public TSettlementObj getSettlementById(String id) {
        List<TSettlementObj> list = create.select().from(Tables.T_SETTLEMENT)
                .where(Tables.T_SETTLEMENT.SETTLEMENT_ID.eq(id))
                .fetchInto(TSettlementObj.class);
        if (list.size()>0){
            return list.get(0);
        }
        return null;
    }
}

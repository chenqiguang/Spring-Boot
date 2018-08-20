package com.chenqiguang.springboot.configuration;

import org.jooq.*;
import org.jooq.impl.DefaultExecuteListener;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JooqAutoLimitExecuteListener extends DefaultExecuteListener {
    public JooqAutoLimitExecuteListener() {}
    @Autowired
    private JooqSettings jooqSettings;

    @Override
    public void start(ExecuteContext ctx) {
        Query query = ctx.query();
        if (query instanceof SelectQuery){
            SelectQuery selectQuery = (SelectQuery) query;
            Object limit = PropertyAccessorFactory.forDirectFieldAccess(query).getPropertyValue("limit");
            if (limit!=null){
                Field<Integer> rows = (Field)PropertyAccessorFactory.forDirectFieldAccess(limit).getPropertyValue("numberOfRows");
                if (rows!=null && rows instanceof Param){
                    Param<Integer> rowsParam = (Param)rows;
                    if (((Integer)rowsParam.getValue()).intValue() > this.jooqSettings.getMaxSelectRows().intValue()) {
                        selectQuery.addLimit(this.jooqSettings.getMaxSelectRows().intValue());
                    }
                }else {
                    selectQuery.addLimit(this.jooqSettings.getMaxSelectRows().intValue());
                }
            }else {
                selectQuery.addLimit(this.jooqSettings.getMaxSelectRows().intValue());
            }
        }
    }
}

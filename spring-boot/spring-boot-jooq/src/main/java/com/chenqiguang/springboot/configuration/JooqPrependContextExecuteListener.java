package com.chenqiguang.springboot.configuration;

import org.apache.commons.lang.StringUtils;
import org.jooq.ExecuteContext;
import org.jooq.impl.DefaultExecuteListener;
import org.springframework.stereotype.Component;

@Component
public class JooqPrependContextExecuteListener extends DefaultExecuteListener {

    public JooqPrependContextExecuteListener() {}

    @Override
    public void renderEnd(ExecuteContext ctx) {
        String sql = ctx.sql();
        if (sql!=null && !"".equals(sql)){
            StringBuilder info = new StringBuilder();

            ctx.sql((StringUtils.isBlank(info.toString()) ? "" : "/*"+info+"*/")+sql);
        }
    }
}

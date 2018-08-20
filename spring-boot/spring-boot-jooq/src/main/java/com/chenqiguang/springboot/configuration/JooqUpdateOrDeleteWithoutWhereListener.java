package com.chenqiguang.springboot.configuration;

import org.jooq.ExecuteContext;
import org.jooq.impl.DefaultExecuteListener;
import org.springframework.stereotype.Component;

@Component
public class JooqUpdateOrDeleteWithoutWhereListener extends DefaultExecuteListener {
    private final String regexDeleteOrUpdateWithoutWhere = "^(?i:(UPDATE|DELETE)(?!.* WHERE ).*)$";
    private final String regexDeleteOrUpdateWithoutWhereTrue = "^(?i:(UPDATE|DELETE) .* WHERE .* (TRUE|\\(TRUE\\)).*)$";

    public JooqUpdateOrDeleteWithoutWhereListener() {
    }

    @Override
    public void renderEnd(ExecuteContext ctx) {
        if (ctx.sql().matches(regexDeleteOrUpdateWithoutWhere) || ctx.sql().matches(regexDeleteOrUpdateWithoutWhereTrue)) {
            throw new DeleteOrUpdateWithoutWhereException(ctx.sql());
        }
    }

    private class DeleteOrUpdateWithoutWhereException extends RuntimeException {
        public DeleteOrUpdateWithoutWhereException(String message) {
            super(message);
        }
    }
}

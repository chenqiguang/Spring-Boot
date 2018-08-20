// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ResponseFixtureRule.java

package com.chenqiguang.springboot.fixture;

import br.com.six2six.fixturefactory.Rule;
import com.chenqiguang.springboot.Response;

import java.lang.reflect.Field;
import java.util.Set;

// Referenced classes of package com.xforceplus.xplat.configuration.fixture:
//            FixtureRule

public class ResponseFixtureRule implements FixtureRule {

    public ResponseFixtureRule() {
    }

    public boolean applyRule(Rule rule, Class clazz, Field field, Set classes) {
        if(Response.class.isAssignableFrom(clazz))
        {
            if("code".equals(field.getName()))
                rule.add(field.getName(), rule.random(new Object[] {
                    Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(0)
                }));
            else
            if("message".equals(field.getName()))
                rule.add(field.getName(), rule.random(new Object[] {
                    "ok", "success", "\u5904\u7406\u6210\u529F", "\u5904\u7406\u5931\u8D25"
                }));
            else
            if("result".equals(field.getName()))
                rule.add(field.getName(), rule.regex("\\d{10}"));
            return true;
        } else
        {
            return false;
        }
    }
}

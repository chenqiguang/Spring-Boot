// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FixtureService.java

package com.chenqiguang.springboot.fixture;

import br.com.six2six.fixturefactory.Fixture;
import org.springframework.context.event.ContextRefreshedEvent;

import java.util.List;

public class FixtureService {
    public static final String VALID = "valid";
    public static final int MOCK_LIST_SIZE = 10;
    private static volatile FixtureService fixtureService;

    public FixtureService() { }

    public static FixtureService getInstance()
    {
        return fixtureService;
    }

    public void saveInstance(ContextRefreshedEvent event)
    {
        fixtureService = (FixtureService)event.getApplicationContext().getBean(FixtureService.class);
    }

    public <T> T get(Class<T> modelType, Class apiType, String methodName, Object params[])
    {
        return Fixture.from(modelType).gimme("valid");
    }

    public <T> List<T> getCollection(Class<T> modelType, Class apiType, String methodName, Object params[])
    {
        return Fixture.from(modelType).gimme(Integer.valueOf(10), "valid");
    }


}

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FixtureRule.java

package com.chenqiguang.springboot.fixture;

import br.com.six2six.fixturefactory.Rule;

import java.lang.reflect.Field;
import java.util.Set;

public interface FixtureRule {

    public abstract boolean applyRule(Rule rule, Class class1, Field field, Set set);
}

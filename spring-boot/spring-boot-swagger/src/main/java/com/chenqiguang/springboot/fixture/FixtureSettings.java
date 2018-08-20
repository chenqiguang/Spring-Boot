// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FixtureSettings.java

package com.chenqiguang.springboot.fixture;

import java.util.ArrayList;
import java.util.List;

public class FixtureSettings
{

    public FixtureSettings()
    {
        modelPackages = new ArrayList();
    }

    public List getModelPackages()
    {
        return modelPackages;
    }

    public void setModelPackages(List modelPackages)
    {
        this.modelPackages = modelPackages;
    }

    private List modelPackages;
}

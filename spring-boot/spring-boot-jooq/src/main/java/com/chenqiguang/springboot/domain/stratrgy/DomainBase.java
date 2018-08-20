package com.chenqiguang.springboot.domain.stratrgy;


import org.apache.commons.beanutils.BeanMap;
import org.apache.commons.beanutils.BeanUtils;

import java.util.HashMap;
import java.util.Map;

public class DomainBase {
    public DomainBase() {
    }

    public void fromMap(Map map) {
        try {
            BeanUtils.copyProperties(this, map);
        } catch (Exception var3) {
            var3.printStackTrace();
        }

    }

    public Map toMap() {
        try {
            return new BeanMap(this);
        } catch (Exception var2) {
            var2.printStackTrace();
            return new HashMap();
        }
    }
}

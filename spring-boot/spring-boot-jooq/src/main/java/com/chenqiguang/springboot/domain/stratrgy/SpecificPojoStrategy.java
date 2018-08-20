package com.chenqiguang.springboot.domain.stratrgy;

import org.jooq.tools.StringUtils;
import org.jooq.util.DefaultGeneratorStrategy;
import org.jooq.util.Definition;

public class SpecificPojoStrategy extends DefaultGeneratorStrategy{
    private final String DOMAIN_BASE_CLASS_NAME = "com.chenqiguang.springboot.domain.stratrgy.DomainBase";

    public SpecificPojoStrategy() {
    }

    @Override
    public String getJavaClassName(Definition definition, Mode mode) {
        if (mode == Mode.POJO) {
            StringBuilder result = new StringBuilder();
            result.append(StringUtils.toCamelCase(definition.getOutputName().replace(" ","_").replace("-","_").replace(".","_")));
            return result.append("Obj").toString();
        }else {
            return super.getJavaClassName(definition, mode);
        }
    }

    @Override
    public String getJavaClassExtends(Definition definition, Mode mode) {
        return mode == Mode.POJO ? DOMAIN_BASE_CLASS_NAME : super.getJavaClassExtends(definition, mode);
    }
}

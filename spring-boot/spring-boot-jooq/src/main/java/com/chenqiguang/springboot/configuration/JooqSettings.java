package com.chenqiguang.springboot.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "xplat.jooq")
public class JooqSettings {
    public static final int DEFAULT_MAX_SELECT_ROWS = 50000;
    private Integer maxSelectRows = Integer.valueOf(50000);

    public JooqSettings() {}

    public Integer getMaxSelectRows() {
        return maxSelectRows;
    }

    public void setMaxSelectRows(Integer maxSelectRows) {
        this.maxSelectRows = maxSelectRows;
    }
}

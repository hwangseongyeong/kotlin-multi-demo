package com.hwang.demo.db.core.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0017J\b\u0010\u0007\u001a\u00020\u0006H\u0017\u00a8\u0006\b"}, d2 = {"Lcom/hwang/demo/db/core/config/PreChargeDataSourceConfig;", "", "()V", "prechargeDataSource", "Lcom/zaxxer/hikari/HikariDataSource;", "config", "Lcom/zaxxer/hikari/HikariConfig;", "prechargeHikariConfig", "db-core"})
@org.springframework.context.annotation.Configuration()
public class PreChargeDataSourceConfig {
    
    public PreChargeDataSourceConfig() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.boot.context.properties.ConfigurationProperties(prefix = "kurly.datasource.pre-charge")
    @org.springframework.context.annotation.Bean()
    public com.zaxxer.hikari.HikariConfig prechargeHikariConfig() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public com.zaxxer.hikari.HikariDataSource prechargeDataSource(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Qualifier(value = "prechargeHikariConfig")
    com.zaxxer.hikari.HikariConfig config) {
        return null;
    }
}
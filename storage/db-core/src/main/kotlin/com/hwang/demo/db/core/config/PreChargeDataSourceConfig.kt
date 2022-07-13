package com.hwang.demo.db.core.config

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
internal class PreChargeDataSourceConfig {
    @Bean
    @ConfigurationProperties(prefix = "kurly.datasource.pre-charge")
    fun prechargeHikariConfig(): HikariConfig {
        return HikariConfig()
    }

    @Bean
    fun prechargeDataSource(@Qualifier("prechargeHikariConfig") config: HikariConfig): HikariDataSource {
        return HikariDataSource(config)
    }
}

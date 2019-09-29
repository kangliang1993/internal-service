package com.internal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableConfigurationProperties
@EnableCaching
@EnableScheduling
@MapperScan("com.internal.dao.front.mapper")
public class FrontWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrontWebApplication.class, args);
    }

}

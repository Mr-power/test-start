package com.study;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * Hello world!
 */
@SpringBootApplication
@Slf4j
public class App {

    public static void main(String[] args) {

        try {
            ConfigurableApplicationContext ctx = SpringApplication.run(App.class, args);
        } catch (Exception e) {
            log.error("启动异常=========", e);
        }

    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.druid.open-api")
    public DataSource dataSource() {
        return DruidDataSourceBuilder.create().build();
    }
}
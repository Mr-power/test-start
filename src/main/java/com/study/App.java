package com.study;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@Slf4j
public class App
{
    public static void main( String[] args )
    {
        try {
            ConfigurableApplicationContext ctx = SpringApplication.run(App.class, args);
        }catch (Exception e){
            log.error("启动异常=========",e);
        }

    }
}

package com.ifx.starter;

import org.apache.dubbo.spring.boot.autoconfigure.DubboAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, DubboAutoConfiguration.class})
public class StarterApplication {
    public static void main(String[] args) {
        SpringApplication.run(StarterApplication.class);
    }
}

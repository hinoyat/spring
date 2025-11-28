package com.test.beantest.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public BeanGreetingService beanGreetingService() {
        return new BeanGreetingService();
    }
}

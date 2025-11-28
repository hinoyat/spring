package com.test.beantest.bean;

import com.test.beantest.GreetingService;

public class BeanGreetingService implements GreetingService {

    @Override
    public String greet() {
        return "BeanGreetingService";
    }

}

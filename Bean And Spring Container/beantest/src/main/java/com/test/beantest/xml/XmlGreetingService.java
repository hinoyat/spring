package com.test.beantest.xml;

import com.test.beantest.GreetingService;

public class XmlGreetingService implements GreetingService {

    @Override
    public String greet() {
        return "XmlGreetingService";
    }
}

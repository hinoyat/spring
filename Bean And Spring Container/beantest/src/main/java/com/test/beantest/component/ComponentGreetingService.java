package com.test.beantest.component;

import com.test.beantest.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class ComponentGreetingService implements GreetingService {

    @Override
    public String greet() {
        return "ComponentGreetingService";
    }

}

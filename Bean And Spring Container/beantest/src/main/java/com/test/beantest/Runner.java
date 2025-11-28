package com.test.beantest;

import com.test.beantest.component.ComponentGreetingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    private final ComponentGreetingService componentGreetingService;
    private final ApplicationContext ctx;

    public Runner(ComponentGreetingService componentGreetingService, ApplicationContext ctx) {
        this.componentGreetingService = componentGreetingService;
        this.ctx = ctx;
    }

    @Override
    public void run(String... args) {
        System.out.println("=== Component Bean ===");
        System.out.println("instance      = " + componentGreetingService);
        System.out.println("runtime class = " + componentGreetingService.getClass());
        System.out.println("containsBean(\"componentGreetingService\") = "
            + ctx.containsBean("componentGreetingService"));
    }
}

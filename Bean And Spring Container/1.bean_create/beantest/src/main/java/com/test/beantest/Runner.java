package com.test.beantest;

import com.test.beantest.bean.BeanGreetingService;
import com.test.beantest.component.ComponentGreetingService;
import com.test.beantest.xml.XmlGreetingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    private final ComponentGreetingService componentGreetingService;
    private final BeanGreetingService beanGreetingService;
    private final XmlGreetingService xmlGreetingService;
    private final ApplicationContext ctx;

    public Runner(ComponentGreetingService componentGreetingService,
        BeanGreetingService beanGreetingService, XmlGreetingService xmlGreetingService, ApplicationContext ctx) {
        this.componentGreetingService = componentGreetingService;
        this.beanGreetingService = beanGreetingService;
        this.xmlGreetingService = xmlGreetingService;
        this.ctx = ctx;
    }

    @Override
    public void run(String... args) {
        System.out.println("=== Component Bean ===");
        System.out.println("instance      = " + componentGreetingService);
        System.out.println("runtime class = " + componentGreetingService.getClass());
        System.out.println("containsBean(\"componentGreetingService\") = "
            + ctx.containsBean("componentGreetingService"));

        System.out.println("=== @Bean Bean ===");
        System.out.println("instance      = " + beanGreetingService);
        System.out.println("runtime class = " + beanGreetingService.getClass());
        System.out.println("containsBean(\"beanGreetingService\") = "
            + ctx.containsBean("beanGreetingService"));

        System.out.println("=== XML Bean ===");
        System.out.println("instance      = " + xmlGreetingService);
        System.out.println("runtime class = " + xmlGreetingService.getClass());
        System.out.println("containsBean(\"xmlGreetingService\") = "
            + ctx.containsBean("xmlGreetingService"));
    }
}

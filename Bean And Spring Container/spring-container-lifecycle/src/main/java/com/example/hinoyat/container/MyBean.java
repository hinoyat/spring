package com.example.hinoyat.container;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

    public MyBean() {
        System.out.println("생성자: MyBean()");
    }

    @PostConstruct
    public void init() {
        System.out.println("@PostConstruct: MyBean.init()");
    }

    public void hello() {
        System.out.println("hello from MyBean");
    }
}

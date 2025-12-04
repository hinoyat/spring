package com.example.hinoyat.container;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

    public MyBean() {
        System.out.println("[MyBean] 생성자 호출");
    }

    @PostConstruct
    public void init() {
        System.out.println("[MyBean] @PostConstruct 실행");
    }

    public void hello() {
        System.out.println("[MyBean] hello()");
    }
}


package com.example.hinoyat.container;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyBean {

    public LazyBean() {
        System.out.println("[LazyBean] 생성자 - 지연 로딩!");
    }

    public void doSomething() {
        System.out.println("[LazyBean] doSomething() 실행");
    }
}
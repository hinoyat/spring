package com.example.hinoyat.container;

import org.springframework.stereotype.Component;

@Component
public class AnotherBean {

    private final MyBean myBean;

    public AnotherBean(MyBean myBean) {
        System.out.println("[AnotherBean] 생성자 - MyBean 주입받음");
        this.myBean = myBean;
    }

    public void useMyBean() {
        System.out.println("[AnotherBean] useMyBean() 실행");
        myBean.hello();
    }
}
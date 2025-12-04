package com.example.hinoyat.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        System.out.println("[Main] === 컨테이너 생성 시작 ===");
        ApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("[Main] === 컨테이너 생성 완료 ===");
        System.out.println();

        System.out.println("[Main] === MyBean 조회 ===");
        MyBean fromContext = context.getBean(MyBean.class);
        System.out.println("[Main] 조회 결과: " + fromContext);
        fromContext.hello();
        System.out.println();

        System.out.println("[Main] === AnotherBean 조회 ===");
        AnotherBean anotherBean = context.getBean(AnotherBean.class);
        anotherBean.useMyBean();
        System.out.println();

        System.out.println("[Main] === LazyBean 조회 ===");
        LazyBean lazyBean = context.getBean(LazyBean.class);
        lazyBean.doSomething();
    }
}
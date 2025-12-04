package com.example.hinoyat.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== 컨테이너 생성 시작 ===");
        ApplicationContext context =
            new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("=== 컨테이너 생성 완료 ===");

        System.out.println("=== 컨테이너에서 MyBean 조회 ===");
        MyBean fromContext = context.getBean(MyBean.class);
        System.out.println("조회 결과: " + fromContext);
        fromContext.hello();
    }

}

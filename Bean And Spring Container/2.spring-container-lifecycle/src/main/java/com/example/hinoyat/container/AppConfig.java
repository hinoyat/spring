package com.example.hinoyat.container;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 스프링 컨테이너 설정 클래스
 * 스프링 환경에서 ApplicationContext를 만들 때 사용할 설정 정보 역할
 */
@Configuration // 이 클래스를 스프링 설정 정보로 사용
@ComponentScan(basePackages = "com.example.hinoyat.container")
// 순수 스프링에서는 자동 스캔이 없으므로, 이 패키지부터 컴포넌트 스캔하라고 직접 지정
public class AppConfig {

}

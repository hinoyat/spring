package com.test.beantest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class BeantestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeantestApplication.class, args);
	}

}

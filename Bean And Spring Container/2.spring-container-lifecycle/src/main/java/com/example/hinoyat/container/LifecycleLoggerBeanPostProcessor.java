package com.example.hinoyat.container;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class LifecycleLoggerBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof MyBean) {
            System.out.println("[BeanPostProcessor] before init: " + beanName + " -> " + bean);
        }
        return bean; // 반드시 원래 bean 리턴 (또는 다른 프록시 리턴)
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof MyBean) {
            System.out.println("[BeanPostProcessor] after init: " + beanName + " -> " + bean);
        }
        return bean;
    }
}

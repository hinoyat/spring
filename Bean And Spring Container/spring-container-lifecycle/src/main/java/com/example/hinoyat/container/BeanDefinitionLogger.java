package com.example.hinoyat.container;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class BeanDefinitionLogger implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
        throws BeansException {

        System.out.println("[BeanDefinitionLogger] === BeanDefinition 목록 출력 ===");

        String[] beanNames = beanFactory.getBeanDefinitionNames();
        System.out.println("[BeanDefinitionLogger] BeanDefinition 개수: " + beanNames.length);

//        for (String beanName : beanNames) {
//            System.out.println("[BeanDefinitionLogger] - " + beanName);
//        }

        System.out.println("[BeanDefinitionLogger] ===============================");
    }
}

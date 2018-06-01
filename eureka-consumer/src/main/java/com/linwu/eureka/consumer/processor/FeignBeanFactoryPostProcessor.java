//package com.linwu.eureka.consumer.processor;
//
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.config.BeanDefinition;
//import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
//import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//
///**
// * @author ：ZhangLei
// * @date ：2018/5/29
// * @description :
// */
//@Component
//public class FeignBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
//    @Override
//    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//        if (containsBeanDefinition(beanFactory, "feignContext", "eurekaAutoServiceRegistration")) {
//            BeanDefinition bd = beanFactory.getBeanDefinition("feignContext");
//            bd.setDependsOn("eurekaAutoServiceRegistration");
//        }
//    }
//
//    private boolean containsBeanDefinition(ConfigurableListableBeanFactory beanFactory, String... beans) {
//        return Arrays.stream(beans).allMatch(b -> beanFactory.containsBeanDefinition(b));
//    }
//}

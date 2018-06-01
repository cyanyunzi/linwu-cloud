package com.linwu.eureka.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//eureka  服务提供方 消费方都要  改注解只针对eureka作为注册中心
public class ProviderRibbon2Application {

	public static void main(String[] args) {
		SpringApplication.run(ProviderRibbon2Application.class, args);
	}
}

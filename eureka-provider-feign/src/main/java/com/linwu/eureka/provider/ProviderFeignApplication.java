package com.linwu.eureka.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient//eureka  服务提供方 消费方都要  改注解只针对eureka作为注册中心
public class ProviderFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderFeignApplication.class, args);
		System.err.println("sample started.  http://localhost:8081/swagger-ui.html");
	}

}

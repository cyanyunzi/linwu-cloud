package com.linwu.eureka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient//eureka  服务方 消费方都要
@EnableFeignClients//feign
public class ConsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerFeignApplication.class, args);
		System.err.println("sample started.  http://localhost:8080/swagger-ui.html");
	}
}

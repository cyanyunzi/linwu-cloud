package com.linwu.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient//eureka  服务方 消费方都要
@EnableFeignClients//feign
@EnableCircuitBreaker
public class FeignHystrixFactoryConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignHystrixFactoryConsumerApplication.class, args);
	}
}

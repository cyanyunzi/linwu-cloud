package com.linwu.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient//eureka  服务方 消费方都要
@EnableFeignClients//feign
public class FeignHystrixConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignHystrixConsumerApplication.class, args);
	}
}

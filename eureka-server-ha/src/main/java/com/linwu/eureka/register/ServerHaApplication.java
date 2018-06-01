package com.linwu.eureka.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//服务注册中心注解
public class ServerHaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerHaApplication.class, args);
	}
}

package com.linwu.zuul.solution.wy.biz.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy//通过ribbon定位注册在Eureka服务，同时整合了hystrix
public class SolutionWyBizGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolutionWyBizGatewayApplication.class, args);
		System.err.println("sample started.  http://localhost:8006/swagger-ui.html");
	}
}

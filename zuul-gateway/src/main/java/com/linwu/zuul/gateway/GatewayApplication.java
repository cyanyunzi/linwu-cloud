package com.linwu.zuul.gateway;

import com.linwu.zuul.gateway.filter.ErrorFilter;
import com.linwu.zuul.gateway.filter.PostFilter;
import com.linwu.zuul.gateway.filter.PreFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy//通过ribbon定位注册在Eureka服务，同时整合了hystrix
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
		System.err.println("sample started.  http://localhost:8005/swagger-ui.html");
	}

	@Bean
	public ErrorFilter errorFilter(){
		return new ErrorFilter();
	}

	@Bean
	public PreFilter preFilter(){
		return new PreFilter();
	}

	@Bean
	public PostFilter postFilter(){
		return new PostFilter();
	}
}

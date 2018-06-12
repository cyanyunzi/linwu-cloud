package com.linwu.eureka.feign;

import feign.Feign;
import feign.Feign.Builder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author ：ZhangLei
 * @date ：2018/6/12
 * @description :
 */
@Configuration
public class ForbidHystrix {

    @Bean
    @Scope("prototype")
    public Feign.Builder feignBuilder(){
        return Feign.builder();
    }
}

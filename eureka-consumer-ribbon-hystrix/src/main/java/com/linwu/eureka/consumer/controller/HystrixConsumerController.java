package com.linwu.eureka.consumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @author ：ZhangLei
 * @date ：2018/5/29
 * @description :
 */

@RestController
@RequestMapping("/hystrix-consumer")
@Slf4j
public class HystrixConsumerController {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    LoadBalancerClient loadBalancerClient;

    @GetMapping
    @HystrixCommand(fallbackMethod = "fallBackTest")
    public String test() {
        log.info("-------------------------");
        //断点到这 超过1秒就执行fallBackTest  应该是可以设置具体的超时时间
        return this.restTemplate.getForObject("http://eureka-provider-ribbon-hystrix/hystrix", String.class);
    }

    @GetMapping("/test1")
    @HystrixCommand(fallbackMethod = "fallBackTest")
    public String test1() {
        log.info("-------------------------");
        //断点到这 超过1秒就执行fallBackTest  应该是可以设置具体的超时时间
        return this.restTemplate.getForObject("http://eureka-provider-ribbon-hystrix/hystrix", String.class);
    }

    public String fallBackTest() {
        return "fallBackTest";
    }

}

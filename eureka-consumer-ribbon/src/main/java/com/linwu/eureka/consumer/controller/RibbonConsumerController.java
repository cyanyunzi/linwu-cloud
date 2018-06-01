package com.linwu.eureka.consumer.controller;

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
@RequestMapping("/consumer")
@Slf4j
public class RibbonConsumerController {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    LoadBalancerClient loadBalancerClient;

    @GetMapping
    public String test(){
        log.info("-------------------------");
        return this.restTemplate.getForObject("http://eureka-provider-ribbon",String.class);
    }


}

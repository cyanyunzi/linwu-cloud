package com.linwu.eureka.consumer.controller;

import com.linwu.common.model.entity.Student;
import com.linwu.eureka.feign.FeignService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


/**
 * @author ：ZhangLei
 * @date ：2018/5/29
 * @description :
 */

@Api(tags = {"feign-consumer"}, description = "消费者feign",hidden = true)
@RestController
@RequestMapping("/feign-consumer")
@Slf4j
public class FeignConsumerController {
    @Autowired
    FeignService feignService;
    /*idea rest测试通过*/

    @GetMapping
    @ApiOperation(value = "消费者feign GET")
    public String test(){
        String result = feignService.test();
        log.info("返回 result:{}",result);
        return result;
    }

    @PostMapping
    public String test1(){
       return  feignService.test(new Student("林雾",25));
    }
}

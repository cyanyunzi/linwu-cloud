package com.linwu.eureka.consumer.controller;

import com.linwu.common.model.entity.Student;
import com.linwu.eureka.feign.FeignHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author ：ZhangLei
 * @date ：2018/5/29
 * @description :
 */

@RestController
@RequestMapping("/feign-consumer-hystrix-feign-factory")
@Slf4j
public class FeignConsumerController {
    @Autowired
    FeignHystrixService feignService;
    /*idea rest测试通过*/

    @GetMapping
    public String test(){
        log.info("-------------------------");
        return feignService.test();
    }

    @PostMapping
    public String test1(){
       return  feignService.test(new Student("林雾",25));
    }
}

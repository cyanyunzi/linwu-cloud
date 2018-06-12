package com.linwu.eureka.feign;

import com.linwu.common.model.entity.Student;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author ：ZhangLei
 * @date ：2018/6/7
 * @description :
 */
@FeignClient(name = "eureka-provider-hystrix-feign",fallback = FeignHystrixServiceFallback.class)//ribbon获取服务名 并调用服务
public interface FeignHystrixService {
    /*
    * 注意：
    * getMapping postMaping 一直报错，换成了requestMapping
    * */

    @RequestMapping(value = "/feign-hystrix-probider",method = RequestMethod.GET)
    String test();

    @RequestMapping(value = "/feign-hystrix-probider",method = RequestMethod.POST)
    String test(@RequestBody Student student);
}

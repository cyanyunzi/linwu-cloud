package com.linwu.eureka.feign;

import com.linwu.common.model.entity.Student;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author ：ZhangLei
 * @date ：2018/6/7
 * @description :
 */
@FeignClient(
name = "eureka-provider-hystrix-feign"/*ribbon获取服务名 并调用服务*/,
configuration = ForbidHystrix.class/*禁用hystrix配置，启用去掉，将不会执行回退，需要回退去掉*/,
fallback = FeignHystrixServiceFallback.class/*回退处理类*/)
public interface FeignHystrixService {
    /*
     * 注意：
     * getMapping postMaping 一直报错，换成了requestMapping
     * */

    @RequestMapping(value = "/feign-hystrix-probider", method = RequestMethod.GET)
    String test();

    @RequestMapping(value = "/feign-hystrix-probider", method = RequestMethod.POST)
    String test(@RequestBody Student student);
}

package com.linwu.eureka.consumer.feign;

import com.linwu.common.model.entity.Student;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author ：ZhangLei
 * @date ：2018/5/29
 * @description :
 */
@FeignClient(name = "eureka-provider")//调用注册中心的服务提供方
@RequestMapping("/feign")
public interface FeignService {

    @GetMapping
    List<Student> feign();

}

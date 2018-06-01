package com.linwu.eureka.consumer.controller;

import com.linwu.eureka.consumer.base.ResultData;
import com.linwu.common.model.entity.Student;
import com.linwu.eureka.consumer.feign.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：ZhangLei
 * @date ：2018/5/29
 * @description :
 */

@RestController
@RequestMapping("/test-feign")
public class FeignController {
    @Autowired
    private FeignService feignService;

    @GetMapping
    public ResultData feign(){
        List<Student> list = feignService.feign();
        return new ResultData(HttpStatus.OK,list);
    }
}

package com.linwu.eureka.provider.controller;

import com.linwu.common.model.entity.Student;
import org.springframework.web.bind.annotation.*;

/**
 * @author ：ZhangLei
 * @date ：2018/5/29
 * @description :
 */
@RestController
@RequestMapping("/feign-probider")
public class FeignProviderController {
    @GetMapping
    public String test(){
        return "feign-probider";
    }

    @PostMapping
    public String test(@RequestBody Student student){
        return student.toString();
    }


}

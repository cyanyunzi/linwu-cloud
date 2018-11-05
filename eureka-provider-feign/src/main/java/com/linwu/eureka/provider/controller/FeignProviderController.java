package com.linwu.eureka.provider.controller;

import com.linwu.common.model.entity.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author ：ZhangLei
 * @date ：2018/5/29
 * @description :
 */
@RestController
@RequestMapping("/feign-probider")
@Api(tags = {"feign-probider"}, description = "服务方feign",hidden = true)
public class FeignProviderController {
    @GetMapping
    @ApiOperation(value = "消服务方feign GET")
    public String test(){
        return "feign-probider";
    }

    @PostMapping
    public String test(@RequestBody Student student){
        return student.toString();
    }


}

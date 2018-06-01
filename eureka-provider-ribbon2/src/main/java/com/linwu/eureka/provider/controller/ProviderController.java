package com.linwu.eureka.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：ZhangLei
 * @date ：2018/5/29
 * @description :
 */
@RestController
@RequestMapping("/probider")
public class ProviderController {
    @GetMapping
    public String test(){
        return "probider2";
    }
}

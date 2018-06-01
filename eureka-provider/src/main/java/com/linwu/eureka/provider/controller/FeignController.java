package com.linwu.eureka.provider.controller;

import com.linwu.common.model.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：ZhangLei
 * @date ：2018/5/29
 * @description :
 */
@RestController
@RequestMapping("/feign")
public class FeignController {
//    @Autowired
//    private Registration registration;
//    @Autowired
//    private DiscoveryClient client;
//    @GetMapping
//    public List<Student> feign(){
//        List<ServiceInstance> instances = client.getInstances(registration.getServiceId());
//        List<Student> list = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            Student s = new Student();
//            s.setName("林雾"+i);
//            s.setAge(i);
//            list.add(s);
//        }
//        return list;
//    }

}

package com.linwu.eureka.feign;

import com.linwu.common.model.entity.Student;
import org.springframework.stereotype.Component;

/**
 * @author ：ZhangLei
 * @date ：2018/6/11
 * @description :
 */
@Component
public class FeignHystrixServiceFallback implements FeignHystrixService {

    @Override
    public String test() {
        return "来自回退";
    }

    @Override
    public String test(Student student) {
        return new Student("林雾回退",23).toString();
    }
}

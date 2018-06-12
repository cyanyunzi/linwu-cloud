package com.linwu.eureka.feign;

import com.linwu.common.model.entity.Student;
import com.linwu.eureka.feign.FeignHystrixService.FeignFactory;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author ：ZhangLei
 * @date ：2018/6/7
 * @description :
 */
@FeignClient(name = "eureka-provider-hystrix-feign", fallbackFactory = FeignFactory.class)//ribbon获取服务名 并调用服务
public interface FeignHystrixService {
    /*
     * 注意：
     * getMapping postMaping 一直报错，换成了requestMapping
     * */

    @RequestMapping(value = "/feign-hystrix-probider", method = RequestMethod.GET)
    @HystrixProperty(name = "hystrix.command.default.execution.timeout.enabled", value = "false")
    String test();

    @RequestMapping(value = "/feign-hystrix-probider", method = RequestMethod.POST)
    @HystrixProperty(name = "hystrix.command.default.execution.timeout.enabled", value = "false")
    String test(@RequestBody Student student);


    @Component
    class FeignFactory implements FallbackFactory<FeignHystrixService> {

        private static final Logger LOG = LoggerFactory.getLogger(FallbackFactory.class);

        @Override
        public FeignHystrixService create(Throwable throwable) {
            //内部类
            return new FeignHystrixService() {
                @Override
                public String test() {
                    FeignFactory.LOG.info("fallback {}", "FeignHystrixService test方法回退");
                    FeignFactory.LOG.error("fallback : {}", throwable.getMessage());
                    return "来自回退";
                }

                @Override
                public String test(Student student) {
                    FeignFactory.LOG.error("fallback", throwable.getMessage());
                    return new Student("林雾回退", 23).toString();
                }
            };
        }
    }

}

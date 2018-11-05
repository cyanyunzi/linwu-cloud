package com.linwu.zuul.solution.wy.biz.gateway.config;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;


@Component
@Primary
public class MySwaggerResourcesProvider implements SwaggerResourcesProvider {
    @Override
    public List<SwaggerResource> get() {
        List<SwaggerResource> resources = new ArrayList<>();
        resources.add(swaggerResource("consumer-feign-1", "/zuul-gateway/consumer/v2/api-docs", "2.0"));
        resources.add(swaggerResource("provider-feign-1", "/zuul-gateway/provider/v2/api-docs", "2.0"));
        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}

//package com.linwu.zuul.gateway.error;
//
//import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.request.RequestAttributes;
//
//import java.util.Map;
//
//@Component
//public class MyErrorAttribute extends DefaultErrorAttributes {
//    @Override
//    public Map<String, Object> getErrorAttributes(RequestAttributes requestAttributes, boolean includeStackTrace) {
//        Map<String, Object> result = super.getErrorAttributes(requestAttributes, includeStackTrace);
//        result.put("status", 500);
//        result.put("error", "error");
//        result.put("exception", "exception");
//        result.put("message", "message");
//        return result;
//    }
//}

package com.linwu.zuul.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class PreFilter extends ZuulFilter {
    @Override
    public String filterType() {
        //定义filter的类型，有pre、route、post、error四种
        return "pre";
    }

    @Override
    public int filterOrder() {
        //定义filter的顺序，数字越小表示顺序越高，越先执行
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        //表示是否需要执行该filter，true表示执行，false表示不执行
        return true;
    }

    @Override
    public Object run() {
        //filter需要执行的具体操作

        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        try {
            log.info("pre 过滤器执行..............request url:{} host:{}",request.getRequestURL(),request.getHeader("X-Forwarded-Port"));
//            throw new RuntimeException("抛出异常");
        } catch (Exception e) {
            ctx.set("error.status_code", HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            ctx.set("error.exception", e);
            //中文resp乱码处理
            ctx.getResponse().setContentType("text/html;charset=UTF-8");
        }



//        if (StringUtils.isNotBlank(token)) {
//            ctx.setSendZuulResponse(true); //对请求进行路由
//            ctx.setResponseStatusCode(200);
//            ctx.set("isSuccess", true);
//            return null;
//        } else {
//            ctx.setSendZuulResponse(false); //不对其进行路由
//            ctx.setResponseStatusCode(400);
//            ctx.setResponseBody("token is empty");
//            ctx.set("isSuccess", false);
//            return null;
//        }
        return null;
    }
}

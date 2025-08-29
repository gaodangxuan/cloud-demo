package com.atguigu.order.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class XTokenRequestInterceptor implements RequestInterceptor {

    /**
     * 请求拦截器（全部生效，如果需要在某个客户端生效，可以通过配置文件的方式）
     *
     * @param requestTemplate
     */
    @Override
    public void apply(RequestTemplate requestTemplate) {
        System.out.println("XTokenRequestInterceptor ........");
        requestTemplate.header("X-Token", UUID.randomUUID().toString());
    }
}

package com.example.feignconsumer.server;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 实现interface，提供降级
 * @create: 2019-12-25 10:09
 **/
@Component
public class FeignServerFallback implements FeignServer {
    @Override
    public Object initial() {
       Map resMap = new HashMap();
       resMap.put("errors", "请等待");
       return resMap;
    }

    @Override
    public Object postJson(Map paramMap) {
        return null;
    }
}

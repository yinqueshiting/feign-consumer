package com.example.feignconsumer.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @Description @FeignClient注解指定服务名来绑定服务 (服务提供者的spring.application.name不区分大小写)
 * @Date 2019/12/24 9:22
 * @Created by xg
 */
@FeignClient(value = "post-in-eureka-server-No1",fallback = FeignServerFallback.class)
public interface FeignServer {
    @RequestMapping("initial")
    Object initial();
    /**
     * @Description 携带参数的测试
     * @Param
     * @return
     * @Date 2019/12/24 9:44
     * @Created by xg
     */
    @RequestMapping("postJson")
    Object postJson(@RequestBody Map paramMap);
}

package com.example.feignconsumer.controller;

import com.example.feignconsumer.server.FeignServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @description: 对Feign客户端的调用
 * @create: 2019-12-24 09:37
 **/
@RestController
public class FeignController {

    @Resource
    private FeignServer feignServer;

    @GetMapping("initial")
    public Object initial(){

        return feignServer.initial();
    }

    @PostMapping("postJson")
    public Object postJson(@RequestBody Map paramMapap){
        return feignServer.postJson(paramMapap);
    }
}

package com.demo1.consumer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.demo1.api.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    public final static String URL="dubbo://192.168.99.1:20880";


    @Reference
    HelloService helloService;

    @Reference(url = URL)
    HelloService helloServiceHttp;

    @RequestMapping("/getStr")
    public String getStr() {
        String str = helloService.getStr();
        return str;
    }
    @RequestMapping("/getStrHttp")
    public String getStrByHttp() {
        String str = helloServiceHttp.getStr();
        return str;
    }
}

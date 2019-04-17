package com.demo1.provider.serviceImpl;


import com.alibaba.dubbo.config.annotation.Service;
import com.demo1.api.service.HelloService;
import org.springframework.stereotype.Component;

@Service
@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public String getStr() {
        return "fdsafdsgsdf";
    }
}

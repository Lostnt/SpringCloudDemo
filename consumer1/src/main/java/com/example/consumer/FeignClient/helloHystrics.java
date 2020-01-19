package com.example.consumer.FeignClient;

import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class helloHystrics implements helloService {
    @Override
    public String sayHello() {
        Date date=new Date();
        return date.toString()+"服务器出现异常！请管理员尽快处理";
    }
}

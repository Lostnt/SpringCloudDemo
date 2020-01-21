package com.example.cloudgateway.Hystrics;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class helloHystrics  {

    @RequestMapping("/helloHystrics")
    public String sayHello() {
        Date date=new Date();
        return date.toString()+"服务器出现异常！请管理员尽快处理";
    }
}

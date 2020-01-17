package com.example.consumer.controller;

import com.example.consumer.FeignClient.helloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
   /* @Autowired
    private RestTemplate resttemplate;*/

    @Autowired
    private helloService helloService;
    @RequestMapping("/hello")
    public String hello() {
/*
        //Ribbon负载均衡

        String url="http://provider/hello";

        //返回值类型和我们的业务返回值一致
        return resttemplate.getForObject(url, String.class);
*/
    return helloService.sayHello();
    }

}

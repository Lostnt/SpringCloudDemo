package com.example.consumer.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "provider",fallback  = helloHystrics.class)
@Component
public interface helloService {
    @RequestMapping("/sayHello?id=1")
    String sayHello() ;
}

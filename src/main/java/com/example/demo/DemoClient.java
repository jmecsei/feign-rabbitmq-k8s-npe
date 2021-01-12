package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "demo", url = "http://localhost:10000/demo")
public interface DemoClient {

    @GetMapping
    String getDemo();
}

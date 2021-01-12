package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private DemoClient demoClient;

    @GetMapping("/demo")
    public String getDemo() {
        return demoClient.getDemo();
    }
}

package com.uniin.consumer.controller;

import com.uniin.consumer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhangyy
 * @date 2020-12-29
 */
//http://localhost:8010/hello/word?name=xx
@RequestMapping("/hello")
@RestController
public class TestController {
    @Autowired
    private TestService testService;
    @GetMapping("/word")
    public String hello(String name){
        return testService.sayHello(name);
    }
}
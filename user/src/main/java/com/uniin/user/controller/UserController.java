package com.uniin.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyy
 * @date 2020-12-29
 */
//http://localhost:8006/zyy/hello?name=xx
@RequestMapping("/zyy")
@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello(@RequestParam String name){
        return "hello "+name;
    }
}

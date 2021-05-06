package com.uniin.consumer.service.Impl;

import com.uniin.consumer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public String sayHello(String name) {
        String url = String.format("http://%s/zyy/hello?name="+name, "client-user");
        String result = restTemplate.getForObject(url, String.class);
        return result;
    }
}

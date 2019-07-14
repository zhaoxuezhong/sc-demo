package com.zxz.scbase.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Value("${server.port}")
    private String port;

    @GetMapping("getInfo")
    public String getInfo(String name){
        return port+":hello,"+name;
    }
}

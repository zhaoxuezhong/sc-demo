package com.zxz.scadmin.controller;

import com.zxz.scadmin.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    BaseService baseService;

    @GetMapping("getInfo")
    public String getInfo(String name){
        return baseService.getInfo(name);
    }
}

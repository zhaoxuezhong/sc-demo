package com.zxz.scadmin.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("sc-base")
@Service
public interface BaseService {

    @GetMapping("/test/getInfo")
    String getInfo(@RequestParam(value = "name") String name);
}

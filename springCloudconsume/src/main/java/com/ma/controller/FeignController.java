package com.ma.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/9/19.
 */
@RestController
public class FeignController {

    @Autowired
    FeignService feignService;
    @Autowired
    FeignCloudService feignCloudService;
    @RequestMapping(value="/FeignConsume/{name}")

    public String Test(@PathVariable String name){
        System.out.println("1");
       return  feignCloudService.scloudProducer(name);
    }


}

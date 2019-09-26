package com.ma.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2019/9/19.
 */
@RestController
public class TestController {
    @Autowired
    RestTemplate restTemplate;
   @RequestMapping(value="/consume/{name}")
    public String Test(@PathVariable String name){
        String url ="http://localhost:8020/producer/"+name;
        return restTemplate.getForObject(url,String.class);
   }


}

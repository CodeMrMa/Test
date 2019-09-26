package com.ma.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/9/19.
 */
@RestController
public class springcloudProducer {
    @RequestMapping(value = "/scloudProducer/{name}")
    public String scloudProducer(@PathVariable("name") String name){
        return "this is scloudProducer"+name;
    }
}

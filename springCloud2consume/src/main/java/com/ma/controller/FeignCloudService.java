package com.ma.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2019/9/19.01
 */
@FeignClient(value = "springCloudProducer")
public interface FeignCloudService {
    @RequestMapping(value = "/scloudProducer/{name}")
    public String scloudProducer(@PathVariable("name") String name);
}

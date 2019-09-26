package com.ma.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2019/9/19.
 */

@FeignClient(value = "springProducter")
public interface FeignService {

    @RequestMapping(value="/producer/{name}")
    public String producer(@PathVariable("name") String name);


}

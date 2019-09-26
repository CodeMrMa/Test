package com.ma;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/9/19.
 */
@RestController

public class producerController {
    @RequestMapping(value="/producer/{name}")
   public String producer(@PathVariable String name){
        return "this is producer" + name;
    }
}

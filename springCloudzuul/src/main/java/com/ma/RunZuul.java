package com.ma;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by Administrator on 2019/9/20.
 */
@SpringCloudApplication
@EnableZuulProxy
public class RunZuul {
    public static void main(String []args){
        SpringApplication.run(RunZuul.class,args);
    }

}

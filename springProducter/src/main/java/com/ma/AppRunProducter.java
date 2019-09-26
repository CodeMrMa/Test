package com.ma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Administrator on 2019/9/19.
 */
@SpringBootApplication
@EnableEurekaClient
public class AppRunProducter {
   public static void main(String [] args){
       SpringApplication.run(AppRunProducter.class,args);
   }

}

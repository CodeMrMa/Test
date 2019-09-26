package com.ma;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Administrator on 2019/9/19.
 */
@SpringCloudApplication
@EnableEurekaClient
public class RunSpringCloudProducer {

    public static void main(String[] args) {
        SpringApplication.run(RunSpringCloudProducer.class, args);
    }
}

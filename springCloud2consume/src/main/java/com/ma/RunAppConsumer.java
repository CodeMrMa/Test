package com.ma;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class RunAppConsumer {
	/**
	 *
	 * @param args
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(RunAppConsumer.class, args);
	}

}

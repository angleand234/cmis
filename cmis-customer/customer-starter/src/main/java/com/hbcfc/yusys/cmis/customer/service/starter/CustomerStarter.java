package com.hbcfc.yusys.cmis.customer.service.starter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.hbcfc.yusys")
@MapperScan("com.hbcfc.yusys.cmis.customer.mapper")
@EnableDiscoveryClient
public class CustomerStarter {

	public static void main(String[] args) {
		SpringApplication.run(CustomerStarter.class, args);

	}
	
}

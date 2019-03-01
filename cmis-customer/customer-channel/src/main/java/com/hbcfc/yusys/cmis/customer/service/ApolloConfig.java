package com.hbcfc.yusys.cmis.customer.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

@Configuration
@EnableApolloConfig
public class ApolloConfig {
	
	@Bean
	public TestJavaConfigBean javaConfigBean() {
		return new TestJavaConfigBean();
	}
	
}

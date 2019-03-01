package com.hbcfc.yusys.cmis.customer.service;

import org.springframework.beans.factory.annotation.Value;

public class TestJavaConfigBean {

	@Value("${timeout:100}")
	private int timeout;
	
	private int batch;
	@Value("${name:danyubin}")
	private String name;
	public int getTimeout() {
		return timeout;
	}
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}
	public int getBatch() {
		System.out.println(batch);
		return batch;
	}
	@Value("${batch:200}")
	public void setBatch(int batch) {
		this.batch = batch;
	}
	public String getName() {
		System.out.println(name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

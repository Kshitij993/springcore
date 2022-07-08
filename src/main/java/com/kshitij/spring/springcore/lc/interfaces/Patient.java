package com.kshitij.spring.springcore.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside setter");
		this.id = id;
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside init or after property set");
		
	}
}

package com.kshitij.spring.springcore.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside setter");
		this.id = id;
	}
	@PostConstruct
	public void hi() {								//this is acting as init method. as it is not mandatory to keep the name "init"
		System.out.println("Inside Hi");
	}
	
	@PreDestroy
	public void bye() {								//this is acting as destroy method.
		System.out.println("Inside bye");
	}
}

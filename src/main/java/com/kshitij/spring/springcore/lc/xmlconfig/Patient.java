package com.kshitij.spring.springcore.lc.xmlconfig;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void hi() {								//this is acting as init method. as it is not mandatory to keep the name "init"
		System.out.println("Inside Hi");
	}
	public void bye() {								//this is acting as destroy method.
		System.out.println("Inside bye");
	}
}

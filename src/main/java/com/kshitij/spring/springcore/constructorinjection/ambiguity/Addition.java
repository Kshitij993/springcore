package com.kshitij.spring.springcore.constructorinjection.ambiguity;

public class Addition {

	Addition(int a, double b) {
		System.out.println("inside");
		System.out.println(a);
		System.out.println(b);
	}

}

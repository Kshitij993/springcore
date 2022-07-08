package com.kshitij.spring.springcore.lc.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLcInterface {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/kshitij/spring/springcore/lc/interfaces/lcconfig.xml");
		Patient patient=(Patient)context.getBean("patient");
		System.out.println(patient.getId());
		context.registerShutdownHook();				// to invoke destroy before object destruction
	}

}

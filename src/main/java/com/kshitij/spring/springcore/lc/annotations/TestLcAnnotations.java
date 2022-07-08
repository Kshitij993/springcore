package com.kshitij.spring.springcore.lc.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLcAnnotations {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kshitij/spring/springcore/lc/annotations/lcconfig.xml");
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient.getId());
		context.registerShutdownHook(); // to invoke destroy before object destruction
	}
}

package com.kshitij.spring.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/kshitij/spring/springcore/propertyplaceholder/config.xml");
		MyDAO m=(MyDAO)context.getBean("mydao");
		System.out.println(m);
	}

}

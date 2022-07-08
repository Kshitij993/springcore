package com.kshitij.spring.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testmap {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kshitij/spring/springcore/map/mapconfig.xml");
		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer); // toString method is defined in pojo it will take care of displaying the values
	}

}

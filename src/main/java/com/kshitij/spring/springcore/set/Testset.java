package com.kshitij.spring.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testset {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/kshitij/spring/springcore/set/setconfig.xml");
		CarDealer cardealer= (CarDealer)context.getBean("cardealer");
//		cardealer.setName("Kshitij");  this is how we can take use input.
		System.out.println(cardealer.getName());
		System.out.println(cardealer.getModels());
		System.out.println(cardealer.getModels().getClass());
		
	}
}

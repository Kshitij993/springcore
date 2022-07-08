package com.kshitij.spring.springcore.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kshitij/spring/springcore/innerbean/config.xml");
		Employee employee=(Employee)context.getBean("employee");
		System.out.println(employee);
		
		
		//for bean scope checking  
		
		Employee employee1=(Employee)context.getBean("employee");
		System.out.println(employee1.hashCode());
		
		Employee employee2=(Employee)context.getBean("employee");
		System.out.println(employee2.hashCode());
	}

}

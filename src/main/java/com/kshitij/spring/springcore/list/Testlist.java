package com.kshitij.spring.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testlist {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/kshitij/spring/springcore/list/listconfig.xml");
		Hospital hospital=(Hospital)context.getBean("hospital");
		System.out.println(hospital.getName());
		System.out.println(hospital.getDepartments());
		System.out.println(hospital.getDepartments().getClass()); // it returns a array list by default
	}

}


// ApplicationContext context=new ClassPathXmlApplicationContext("com/kshitij/spring/springcore/list/listconfig.xml"); this can also be done
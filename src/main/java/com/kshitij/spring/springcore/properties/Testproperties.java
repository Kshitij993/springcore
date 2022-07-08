package com.kshitij.spring.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testproperties {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/kshitij/spring/springcore/properties/propertyconfig.xml");
		CountriesAndLanguages countriesAndL = (CountriesAndLanguages) context.getBean("countaryAndLanguage");
		System.out.println(countriesAndL);

	}

}

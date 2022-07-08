package com.kshitij.spring.springcore.lc.ticketReservation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/kshitij/spring/springcore/lc/ticketReservation/config.xml");
		TicketReservation ticket= (TicketReservation)context.getBean("ticket");
		System.out.println(ticket);
		context.registerShutdownHook();
	}

}

package com.kshitij.spring.springcore.lc.ticketReservation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	private int id;
	private String name;

	@Override
	public String toString() {
		return "TicketReservation [id=" + getId() + ", name=" + getName() + "]";
	}

	@PostConstruct
	public void initilize() {
		System.out.println("Inside Inisilize");
	}

	@PreDestroy
	public void cleanUp() {
		System.out.println("Inside Clean Up");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

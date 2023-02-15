package com.jdc.mkt.ds;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Person {

	private int id;
	private String name;
	private Address address;
	
	
	
	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}



	public Person() {
		super();
	}
	
	
	
	
}

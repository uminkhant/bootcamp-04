package com.jdc.mkt.ds;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Address {

	private int id;
	private String city;
	private String township;
	private String street;
	
	
	
	public Address(String city, String township, String street) {
		super();
		this.city = city;
		this.township = township;
		this.street = street;
	}



	public Address() {
		super();
	}
	
	
}

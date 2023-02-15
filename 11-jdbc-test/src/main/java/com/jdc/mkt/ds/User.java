
package com.jdc.mkt.ds;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class User {

	private int id;
	private String name;
	private String password;
	private boolean isActive;
	
	
	
	public User(String name, String password, boolean isActive) {
		super();
		this.name = name;
		this.password = password;
		this.isActive = isActive;
	}



	public User() {
		super();
	}
	
	
	
}

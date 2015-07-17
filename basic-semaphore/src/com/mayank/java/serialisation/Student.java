package com.mayank.java.serialisation;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 4253283591488827109L;
	private String name;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return name+"-"+address;
	}

}

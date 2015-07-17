package com.mayank.java.serialisation;

public interface Interface {

	public default void print() {
		System.out.println("Print");
	}

	public default void print(String name) {
		System.out.println("Print-"+name);
	}

}

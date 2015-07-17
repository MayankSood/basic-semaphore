package com.mayank.linkedlist;

import java.util.HashMap;


public class LinkedListExecutor {
	
	public static void main(String[] args) throws InterruptedException {
		LinkedList<String> asd= new LinkedList<String>();
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		map.put("5", "5");
		
		asd.add("Mayank0");
		asd.add("Mayank1");
		asd.add("Mayank2");
		asd.add("Mayank3");
		asd.add("Mayank4");
		asd.remove(2);
		
		for (Object s : asd.toArray()) {
			System.out.println(s.toString());
		}
		
		System.out.println(asd.contains("Mayank4"));
	}

}

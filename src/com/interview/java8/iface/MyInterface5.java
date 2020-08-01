package com.interview.java8.iface;

public interface MyInterface5 {

	public static void display () {
		System.out.println("Hello World");
	}	
	
	public static void greet (String name) {
		System.out.println("Hello "+name);
	}
	
	public static void greet (String firstName , String lastName) {
		System.out.println("Hello "+firstName+" "+lastName);
	}
}

package com.interview.java8.impl;

import com.interview.java8.iface.MyInterface1;
import com.interview.java8.iface.MyInterface2;
import com.interview.java8.iface.MyInterface3;
import com.interview.java8.iface.MyInterface4;

public class Lambda1 {

	public static void main(String[] args) {
		MyInterface1 myInterface1 = (name) -> System.out.println("Your name is: "+name);
		
		System.out.println("----------------------------------------------------------");
		MyInterface2 myInterface2 = (name , city , age)-> {
			System.out.println("Your name is : "+name);
			System.out.println("Your city is : "+city);
			System.out.println("Your age is : "+age);
		};
		myInterface1.greet("Rajat");
		System.out.println("----------------------------------------------------------");
		myInterface2.displayInfo("Rajat", "Allahabad", 21);
		System.out.println("----------------------------------------------------------");

		myInterface1.greet("Monty");
		System.out.println("----------------------------------------------------------");
		myInterface2.displayInfo("Monty", "San Jose", 27);
		System.out.println("----------------------------------------------------------");
		
		myInterface1.greet("Sharad");
		System.out.println("----------------------------------------------------------");
		myInterface2.displayInfo("Sharad", "Balrampur", 19);
		System.out.println("----------------------------------------------------------");
		
		MyInterface3 myInterface3 = ()-> System.out.println("Testing Lambda Expression");
		myInterface3.test();
		
		System.out.println("----------------------------------------------------------");
		
		MyInterface4 myInterface4 = (a , b) -> {
			if(a==b) {
				System.out.println(a+" and "+b +" are equal");
				return true;
			}
			else {
				System.out.println(a+" and "+b +" are not equal");
				return false;
			}
			};
		myInterface4.areEqual(5 ,  5);
		System.out.println("----------------------------------------------------------");
		myInterface4.areEqual(10 ,  5);
	}

}

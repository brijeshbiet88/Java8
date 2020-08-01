package com.interview.java8.lambda;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;

import com.interview.java8.iface.MyInterface5;

public class StaticMethodReference {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		Runnable command1 = StaticMethodReference::myRun; 
		executorService.execute(command1);
		
		Runnable command2 = MyInterface5::display; 
		executorService.execute(command2);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);list.add(2);list.add(3);list.add(4);
		StaticMethodReference.printSquare(list, Integer::new);
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ajay");names.add("Suresh");names.add("Shubham");names.add("Prince");
		StaticMethodReference staticMethodReference = new StaticMethodReference();
		names.forEach(staticMethodReference::greet);
		
		
	}

	private static void printSquare(ArrayList<Integer> list, Function<Integer, Integer> f) {
		list.forEach((s)-> {
			s = f.apply(s*s); 
			System.out.println(s);
		});
	}

	public  static void myRun() {
		System.out.println("My Thread is Running...");
	}
	
	public void greet(String name) {
		System.out.println("Hello "+name);
	}
}

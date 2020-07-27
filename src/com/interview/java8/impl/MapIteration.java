package com.interview.java8.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.Set;

import com.interview.java8.model.Student;

public class MapIteration {

	public static void main(String args[]) {
		
		Map<Integer, Student> map = new HashMap<>();
		map.put(1, new Student("Rajat ",  22));
		map.put(2, new Student("Sharad",  19));
		map.put(3, new Student("Monty ",  27));
		map.put(4, new Student("Corkit",  30));
		System.out.println("----------------------------------------");
		iterate1(map);
		System.out.println("----------------------------------------");
		iterate2(map);
		System.out.println("----------------------------------------");
		iterate3(map);
	}

	private static void iterate1(Map<Integer, Student> map) {
		Set<Entry<Integer,Student>> entrySet = map.entrySet();
		for(Entry<Integer, Student> entry : entrySet) {
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}		
	}

	private static void iterate2(Map<Integer, Student> map) {
		map.forEach((k ,v)-> System.out.println(k+"\t"+v));		
	}
	
	private static void iterate3(Map<Integer, Student> map) {
		map.forEach(new MyBiConsumer());		
	}
}

class MyBiConsumer implements BiConsumer<Integer, Student>{

	@Override
	public void accept(Integer i, Student s) {
		System.out.println(i+"\t"+s);		
	}
	
}

package com.interview.java8.lambda;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

import com.interview.java8.model.Student;

public class IterateListAndSet {

	public static void main(String[] args) {
		Student s1 = new Student("Rajat", 22);
		Student s2 = new Student("Sharad", 19);
		Student s3 = new Student("Monty", 27);
		Student s4 = new Student("Brijesh", 30);
		
		List<Student> list = new ArrayList<>();
		list.add(s1);list.add(s2);list.add(s3);list.add(s4);
		Set<Student> set = new HashSet<>();
		set.add(s1);set.add(s2);set.add(s3);set.add(s4);
		
		System.out.println("------Iterate List 1-------");
		list.forEach(new MyConsumer());
		System.out.println("------Iterate Set 1--------");
		set.forEach(new MyConsumer());
		System.out.println("------Iterate List 2-------");
		list.forEach(s->System.out.println("name :"+s.getName()+"	age:"+s.getAge()));
		System.out.println("------Iterate Set 2-------");
		set.forEach(s->System.out.println("name :"+s.getName()+"	age:"+s.getAge()));
		
	}

	

	
}

class MyConsumer implements Consumer<Student>{
	@Override
	public void accept(Student s) {
		System.out.println("name :"+s.getName()+"	age:"+s.getAge());
	}
	
}

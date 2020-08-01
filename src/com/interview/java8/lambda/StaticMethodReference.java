package com.interview.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;

import com.interview.java8.iface.MyInterface5;
import com.interview.java8.model.Student;

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
		
		ArrayList<Student> students = new ArrayList<Student>();
		Student s1 = new Student("Santosh", 38);
		Student s2 = new Student("Rupesh", 46);
		Student s3 = new Student("Dinesh", 48);
		
		students.add(s1);students.add(s2);students.add(s3);
		
		List<String> studentNames = StaticMethodReference.printStudentNames(students, Student::getName);
		studentNames.forEach(System.out::println);
		
		List<Integer> studentAges = StaticMethodReference.printStudentAges(students, Student::getAge);
		studentAges.forEach(System.out::println);
		
	}

	private static List<Integer> printStudentAges(ArrayList<Student> students, Function<Student, Integer> f) {
		List<Integer> ages = new ArrayList<Integer>();
		students.forEach((name)->{
			ages.add(f.apply(name));
		});
		return ages;
	}

	private static List<String> printStudentNames(ArrayList<Student> students, Function<Student, String> f) {
		List<String> names = new ArrayList<String>();
		students.forEach((name)->{
			names.add(f.apply(name));
		});
		return names;
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

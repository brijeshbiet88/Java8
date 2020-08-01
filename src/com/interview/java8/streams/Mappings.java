package com.interview.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.interview.java8.model.Emplolyee;

public class Mappings {

	public static void main(String[] args) {
		Emplolyee e1 = new Emplolyee("1", "Brijesh");
		List<String> techstack1 = new ArrayList<String>();
		techstack1.add("Java 8");
		techstack1.add("Spark");
		techstack1.add("Kafka");
		techstack1.add("Cassandra");
		e1.setTechStack(techstack1);
		
		Emplolyee e2 = new Emplolyee("2", "Prabhu");
		List<String> techstack2 = new ArrayList<String>();
		techstack2.add("Testing");
		techstack2.add("Automation");
		techstack2.add("ControlM");
		e2.setTechStack(techstack2);
		
		Emplolyee e3 = new Emplolyee("3", "Bharat");
		List<String> techstack3 = new ArrayList<String>();
		techstack3.add("Angular");
		techstack3.add("React");
		e3.setTechStack(techstack3);
		
		List<Emplolyee> employees = new ArrayList<Emplolyee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		Stream<String> stream = employees.stream().flatMap(e->e.getTechStack().stream());
		stream.forEach(System.out::println);
		System.out.println("-----------------------------------------");
		Stream<Emplolyee> empStream = employees.stream();
		empStream = empStream.map(e->{
		 e.setName(e.getName().toUpperCase());	
		 return e;
		});
		
		empStream.forEach(e-> System.out.println(e.getName()));
	}
}

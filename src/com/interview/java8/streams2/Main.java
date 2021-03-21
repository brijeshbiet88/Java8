package com.interview.java8.streams2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    List<Person> people = getPeople();

    // Declarative approach

    // Filter
    List<Person> females = people.stream()
        .filter(person -> person.getGender().equals(Gender.FEMALE))
        .collect(Collectors.toList());
     System.out.println("Filter For Female");
     females.forEach(System.out::println);
     System.out.println();

    // Sort
    List<Person> sorted = people.stream()
        .sorted(Comparator.comparing(Person::getAge).reversed().thenComparing(Person::getGender))
        .collect(Collectors.toList());
    	System.out.println("Sorting based on Age and Then Gender ");
        sorted.forEach(System.out::println);
        System.out.println();
        
        
    // All match
    boolean allMatch = people.stream()
        .allMatch(person -> person.getAge() > 8);

    System.out.println("Whether All matches where age is Greater Than 8");
    System.out.println(allMatch);
    System.out.println();
    
    
    System.out.println("Whether Any match where age is Greater Than 121");
    boolean anyMatch = people.stream()
        .anyMatch(person -> person.getAge() > 121);
    System.out.println(anyMatch);
    System.out.println();
    
    System.out.println("Whether None matches where Naame is Antonio");
    boolean noneMatch = people.stream()
        .noneMatch(person -> person.getName().equals("Antonio"));

    System.out.println(noneMatch);
    System.out.println();
    // Max
    System.out.println("Person With Max Age");
    people.stream()
        .max(Comparator.comparing(Person::getAge))
        .ifPresent(System.out::println);
    System.out.println();

    // Min
    System.out.println("Person With Min Age");
    people.stream()
        .min(Comparator.comparing(Person::getAge))
        .ifPresent(System.out::println);
    System.out.println();
    
    // Group
    System.out.println("Group By Gender ");
    Map<Gender, List<Person>> groupByGender = people.stream()
        .collect(Collectors.groupingBy(Person::getGender));

    	groupByGender.forEach((gender, people1) -> {
    	System.out.println(gender);
    	people1.forEach(System.out::println);
    	System.out.println();
    	});
    	
    	System.out.println();
    	
    	
    	 // Group By Gender and Average Age
        System.out.println("Group By Gender and Average Age");
        Map<Gender, Double> groupByGenderAvg = people.stream()
            .collect(Collectors.groupingBy(Person::getGender ,  Collectors.averagingInt(Person :: getAge)) );

        	groupByGenderAvg.forEach((gender, people1) -> {
        	System.out.print("Gender "+gender);
        	System.out.println("  Average Age "+people1);
        	System.out.println();
        	});
        	
        	System.out.println();
        	
        	
        	 // Group By Gender and Average Age
            System.out.println("Group By Gender and Sum Age");
            Map<Gender, Integer> groupByGenderSum = people.stream()
                .collect(Collectors.groupingBy(Person::getGender ,  Collectors.summingInt(Person :: getAge) ) );

            	groupByGenderSum.forEach((gender, people1) -> {
            	System.out.print("Gender "+gender);
            	System.out.println("  Summation Age "+people1);
            	System.out.println();
            	});
            	
            	System.out.println();
        	
        	
    System.out.println("Optional Demo ");
    Optional<String> oldestFemaleAge = people.stream()
        .filter(person -> person.getGender().equals(Gender.FEMALE))
        .max(Comparator.comparing(Person::getAge))
        .map(Person::getName);

    oldestFemaleAge.ifPresent(System.out::println);
  }

  private static List<Person> getPeople() {
     List <Person> people = new ArrayList<>();
        people.add(new Person("Antonio", 22, Gender.MALE));
        people.add(new Person("Alina Smith", 33, Gender.FEMALE));
        people.add(new Person("Helen White", 57, Gender.FEMALE));
        people.add(new Person("Alex Boz", 14, Gender.MALE));
        people.add(new Person("Jamie Goa", 99, Gender.MALE));
        people.add(new Person("Anna Cook", 7, Gender.FEMALE));
        people.add(new Person("Jennifer Brown", 120, Gender.FEMALE));
        people.add(new Person("Zelda Brown", 120, Gender.FEMALE));
        people.add(new Person("Rosie Wane", 20, Gender.FEMALE));
        people.add(new Person("Michelle Taylor", 7, Gender.FEMALE));
		return people;
    
  }

}
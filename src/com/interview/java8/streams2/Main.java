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

/*
 * Filter For Female
Person [name=Alina Smith, age=33, gender=FEMALE]
Person [name=Helen White, age=57, gender=FEMALE]
Person [name=Anna Cook, age=7, gender=FEMALE]
Person [name=Jennifer Brown, age=120, gender=FEMALE]
Person [name=Zelda Brown, age=120, gender=FEMALE]
Person [name=Rosie Wane, age=20, gender=FEMALE]
Person [name=Michelle Taylor, age=7, gender=FEMALE]

Sorting based on Age and Then Gender 
Person [name=Jennifer Brown, age=120, gender=FEMALE]
Person [name=Zelda Brown, age=120, gender=FEMALE]
Person [name=Jamie Goa, age=99, gender=MALE]
Person [name=Helen White, age=57, gender=FEMALE]
Person [name=Alina Smith, age=33, gender=FEMALE]
Person [name=Antonio, age=22, gender=MALE]
Person [name=Rosie Wane, age=20, gender=FEMALE]
Person [name=Alex Boz, age=14, gender=MALE]
Person [name=Anna Cook, age=7, gender=FEMALE]
Person [name=Michelle Taylor, age=7, gender=FEMALE]

Whether All matches where age is Greater Than 8
false

Whether Any match where age is Greater Than 121
false

Whether None matches where Naame is Antonio
false

Person With Max Age
Person [name=Jennifer Brown, age=120, gender=FEMALE]

Person With Min Age
Person [name=Anna Cook, age=7, gender=FEMALE]

Group By Gender 
FEMALE
Person [name=Alina Smith, age=33, gender=FEMALE]
Person [name=Helen White, age=57, gender=FEMALE]
Person [name=Anna Cook, age=7, gender=FEMALE]
Person [name=Jennifer Brown, age=120, gender=FEMALE]
Person [name=Zelda Brown, age=120, gender=FEMALE]
Person [name=Rosie Wane, age=20, gender=FEMALE]
Person [name=Michelle Taylor, age=7, gender=FEMALE]

MALE
Person [name=Antonio, age=22, gender=MALE]
Person [name=Alex Boz, age=14, gender=MALE]
Person [name=Jamie Goa, age=99, gender=MALE]


Group By Gender and Average Age
Gender FEMALE  Average Age 52.0

Gender MALE  Average Age 45.0


Group By Gender and Sum Age
Gender FEMALE  Summation Age 364

Gender MALE  Summation Age 135


Optional Demo 
Jennifer Brown

 * */
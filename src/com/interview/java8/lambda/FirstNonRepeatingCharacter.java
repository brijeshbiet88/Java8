package com.interview.java8.lambda;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonRepeatingCharacter {

	 
	  public static void main(String[] args) {
	 
	    System.out.println("Please  Enter The String  :");
	    Scanner in = new Scanner(System.in);
	    String input = in.nextLine();
	    Character firstNonRepeatedChar = findFirstNonRepeatedChar(input);
	    System.out.println("The  First Non-Repeated Character Is : " + firstNonRepeatedChar);
	    in.close();
	  }
	 
	  private static Character findFirstNonRepeatedChar(String str) {  
	        Stream<Character> charStream =  str.chars()    
	             .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)));
	        
	        Character result =  charStream.collect(Collectors.groupingBy(Function.identity(),
	        		            LinkedHashMap::new, Collectors.counting())) //store in a linked hash map with the count
	        					.entrySet().stream()
	        					.filter(entry -> entry.getValue() == 1L)
	        					.map(entry -> entry.getKey())
	        					.findFirst().get();
	        
	         return result;    
	  }
}

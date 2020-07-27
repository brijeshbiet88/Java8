package com.interview.java8.lambda;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MaxOccuringCharacter {

	public static void main(String[] args) {
		
		String str = "program to compute max occuring character ";
		CharFrequency charFrequency = findMaxOccuringCharacter(str);
		System.out.println("Max Occuring Character = "+charFrequency.getCharacter()+" Frequency = "+charFrequency.getFrequency());
	}

	private static CharFrequency findMaxOccuringCharacter(String str) {
		CharFrequency charFrequency = new CharFrequency();
		Map <Character , Integer> map = new HashMap<Character , Integer>();
		str = str.replaceAll("\\s+", "");
		int i = 0;
		while(i < str.length()) {
			char c = str.charAt(i);
			map.put(c , map.getOrDefault(c, 0)+1);
			i++;
		}
		System.out.println(map);
		
		Integer maxFrequency = 0;
		Character maxChar = null;
		Iterator<Character> itr = map.keySet().iterator();
		while(itr.hasNext()) {
			Character c = itr.next();
			if(maxFrequency < map.get(c)) {
				maxFrequency = map.get(c);
				maxChar = c;
			}
		}
		charFrequency.setCharacter(maxChar);
		charFrequency.setFrequency(maxFrequency);
		return charFrequency;
		
	}

}

class CharFrequency {
	
	private int frequency;
	private char character;
	
	public char getCharacter() {
		return character;
	}
	public void setCharacter(char character) {
		this.character = character;
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	} 
}

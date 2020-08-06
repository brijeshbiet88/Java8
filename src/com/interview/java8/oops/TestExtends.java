package com.interview.java8.oops;

public class TestExtends {

	public static void main(String[] args) {
		Car c = new Car();
		c.setName("A");
		c.setColor("Red");
		c.setPrice(546);

		
		Hyundai h1 = new Hyundai();
		h1.setMileage(20);
		h1.setName("AB");
		h1.setColor("Blue");
		h1.setPrice(54656);
		Car h = h1;
		
		System.out.println(h.getName()+" "+h.getColor()+" "+h.getPrice()+" ");
	}

}

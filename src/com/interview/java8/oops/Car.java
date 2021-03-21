package com.interview.java8.oops;

public class Car {
	
	private String name;
	private String color;
	private int price;
	
	@Override
	public String toString() {
		return "Car: [name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	public Car() {
		super();
	}
	public Car(String name, String color, int price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}

package com.interview.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.interview.java8.oops.Car;

public class StreamDemo {

	public static void main(String[] args) {
		List<Car> cars = getCars();
		List<Car> redCars = cars.stream().filter(c -> c.getColor().equalsIgnoreCase("Red")).collect(Collectors.toList());
		System.out.println("Red Cars Details : ");
		redCars.forEach(c -> System.out.println(c));
		
		List<Car> redCarsSortedByName = redCars.stream().sorted(Comparator.comparing(Car::getName)).collect(Collectors.toList());
		System.out.println("Red Cars Details Sorted By Name: ");
		redCarsSortedByName.forEach(System.out::println);
		

		List<Car> redCarsSortedByPrice = redCars.stream().sorted(Comparator.comparing(Car::getPrice).reversed()).collect(Collectors.toList());
		System.out.println("Red Cars Details Sorted By Price High To Low: ");
		redCarsSortedByPrice.forEach(System.out::println);
		
		List<Car> carsSortedByColorAndPrice = cars.stream().sorted(Comparator.comparing(Car::getColor).thenComparing(Car::getPrice)).collect(Collectors.toList());
		System.out.println("Cars Details Sorted By Color and Then Price: ");
		carsSortedByColorAndPrice.forEach(System.out::println);
		
	}

	private static List<Car> getCars() {
		List<Car> cars = new ArrayList<Car>();
		Car car1 = new Car("Swift", "White", 675000);
		Car car2 = new Car("Dzire", "White", 800000);
		Car car3 = new Car("Creta", "Red", 1200000);
		Car car4 = new Car("Tiago", "Red", 565000);
		Car car5 = new Car("Celerio", "White", 550000);
		Car car6 = new Car("WagonR", "Red", 400000);
		Car car7 = new Car("Alto", "White", 420000);
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		cars.add(car6);
		cars.add(car7);
		return cars;

	}

}

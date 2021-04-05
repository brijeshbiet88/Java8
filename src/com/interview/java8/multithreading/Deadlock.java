package com.interview.java8.multithreading;

public class Deadlock {

	static String lock1 = "lock1";
	static String lock2 = "lock2";

	public static void main(String[] args) {
		Runnable r1 = () ->{
				    synchronized (lock1) {
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						System.out.println("Exception "+e.getMessage());
					}
					synchronized (lock2) {
						System.out.println(lock1+" "+lock2);
					}
				}
		};

		Runnable r2 = () -> {

					synchronized (lock2) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						System.out.println("Exception "+e.getMessage());
					}
					synchronized (lock1) {
						System.out.println(lock2+" "+lock1);
					}
			}
		};

		Thread one = new Thread(r1, "Remainder-1");
		Thread two = new Thread(r2, "Remainder-2");

		one.start();
		two.start();
	}
}

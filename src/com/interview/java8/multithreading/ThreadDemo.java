package com.interview.java8.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		Runnable r1 = ()-> System.out.println("Thread 1 is running : "+Thread.currentThread().getName());
		Runnable r2 = ()-> System.out.println("Thread 1 is running : "+Thread.currentThread().getName());
		Thread t1 = new Thread(r1, "Thread-R1");
		Thread t2 = new Thread(r2, "Thread-R2");
		t1.start();
		t2.start();
	}

}
/*
Thread 1 is running : Thread-R2
Thread 1 is running : Thread-R1

 */
 
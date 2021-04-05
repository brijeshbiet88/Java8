package com.interview.java8.multithreading;

public class PrintingEvenOdd2Threads {

	static int number = 10;
	static String lock = "locker";
	static int target = 20;
	public static void main(String[] args) {
		
		
		Runnable r1 = () -> {
			
				while(number <= target) {
					synchronized (lock) {
					try {
						while(number%2 != 1)
						lock.wait();
					} catch (InterruptedException e) {
						System.out.println("Exception : "+e.getMessage());
					}
					if(number <= target) {
						System.out.println(Thread.currentThread().getName()+" 	"+number);	
					}
					number++;
					lock.notifyAll();
				}
			}
		};
		
		Runnable r2 = () ->{
			
				while(number <= target) {
					synchronized (lock) {
					try {
						while(number%2 != 0)
						lock.wait();
					} catch (InterruptedException e) {
						System.out.println("Exception : "+e.getMessage());
					}
					if(number <= target) {
						System.out.println(Thread.currentThread().getName()+" 	"+number);	
					}
					number++;
					lock.notifyAll();
				}
			}
		};
		
		Thread one = new Thread(r1 , "Remainder-1");
		Thread two = new Thread(r2 , "Remainder-0");
	
		one.start();
		two.start();
	
		
	}


}
/*
Remainder-0 	10
Remainder-1 	11
Remainder-0 	12
Remainder-1 	13
Remainder-0 	14
Remainder-1 	15
Remainder-0 	16
Remainder-1 	17
Remainder-0 	18
Remainder-1 	19
Remainder-0 	20

 * */

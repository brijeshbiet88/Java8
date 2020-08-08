package com.interview.java8.multithreading;

public class WaitAndNotify {
	
	static int number = 15;
	static String lock = "locker";
	static int target = 30;
	public static void main(String[] args) {
		
		
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				
				while(number <= target) {
					synchronized (lock) {
					try {
						while(number%3 != 1)
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
			}
		};
		
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				
				while(number <= target) {
					synchronized (lock) {
					try {
						while(number%3 != 2)
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
			}
		};
		
		Runnable r3 = new Runnable() {
			
			@Override
			public void run() {
				
				while(number <= target) {
					synchronized (lock) {
					try {
						while(number%3 != 0)
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
			}
		};
		
		Thread one = new Thread(r1 , "Remainder-1");
		Thread two = new Thread(r2 , "Remainder-2");
		Thread three = new Thread(r3,"Remainder-0" );
		one.start();
		two.start();
		three.start();
		
	}

}
/*
Remainder-0 	15
Remainder-1 	16
Remainder-2 	17
Remainder-0 	18
Remainder-1 	19
Remainder-2 	20
Remainder-0 	21
Remainder-1 	22
Remainder-2 	23
Remainder-0 	24
Remainder-1 	25
Remainder-2 	26
Remainder-0 	27
Remainder-1 	28
Remainder-2 	29
Remainder-0 	30

 * */

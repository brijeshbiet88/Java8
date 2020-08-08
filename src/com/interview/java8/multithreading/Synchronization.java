package com.interview.java8.multithreading;

import java.time.LocalTime;

public class Synchronization {

	public static void main(String[] args) {
		String lock = "lock";
		
		Runnable r1 = () -> {
			for (int i = 1; i <= 5; i++) {
				synchronized (lock) {
					System.out.println(LocalTime.now()+" " + Thread.currentThread().getName() + " i=" + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("Exception " + e.getMessage());
					}
				}
			}

		};
		Runnable r2 = () -> {

			for (int i = 1; i <= 5; i++) {
				synchronized (lock) {
					System.out.println(LocalTime.now()+" " + Thread.currentThread().getName() + " i=" + i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						System.out.println("Exception " + e.getMessage());
					}
				}
			}
		};
		Thread t1 = new Thread(r1, "Thread-R1");
		Thread t2 = new Thread(r2, "Thread-R2");
		t1.start();
		t2.start();

	}

}

/*
12:50:22.140 Thread-R1 i=1
12:50:23.142 Thread-R1 i=2
12:50:24.142 Thread-R1 i=3
12:50:25.143 Thread-R1 i=4
12:50:26.143 Thread-R1 i=5
12:50:27.144 Thread-R2 i=1
12:50:27.245 Thread-R2 i=2
12:50:27.345 Thread-R2 i=3
12:50:27.446 Thread-R2 i=4
12:50:27.546 Thread-R2 i=5

 */

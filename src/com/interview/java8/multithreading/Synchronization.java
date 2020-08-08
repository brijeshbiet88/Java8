package com.interview.java8.multithreading;

public class Synchronization {

	public static void main(String[] args) {
		String lock = "lock";
		
		Runnable r1 = ()-> {
			
			
				
				for(int i = 1; i <= 5 ; i++ )	{
					synchronized (lock) {			
				System.out.println("Holding Lock 1 : "+Thread.currentThread().getName()+" i="+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
			}
			
		};
		Runnable r2 = ()-> {
			
				
					for(int i = 1; i <= 5 ; i++ )	{
						synchronized (lock) {
					System.out.println("Holding Lock 2 : "+Thread.currentThread().getName()+" i="+i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
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

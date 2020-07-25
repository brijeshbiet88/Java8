package com.interview.java8.lambda;

public class LambdaExpression {

	public static void main(String[] args) {
		threadUsingAnonymous();
		threadUsingLambda();
	}

	private static void threadUsingAnonymous() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread Using Anonymous Class");

			}
		};
		
		Thread thread = new Thread(r);
		thread.start();
	}

	private static void threadUsingLambda() {
		Runnable r = () -> System.out.println("Thread Using Lambda Expression");
	
		Thread thread = new Thread(r);
		thread.start();
	}

}

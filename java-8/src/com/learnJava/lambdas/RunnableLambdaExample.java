package com.learnJava.lambdas;

public class RunnableLambdaExample {
	public static void main(String[] args) {

		/**
		 * Prior to java 8
		 */

		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("Inside runnable 1");

			}
		};

		new Thread(r).start();

		/**
		 * Java 8
		 */

		Runnable r1 = () -> {
			System.out.println("inside runnable 2");
		};

		new Thread(r1).start();

		Runnable r2 = () -> System.out.println("inside runnable 3");

		new Thread(r2).start();

		new Thread(() -> System.out.println("inside runnable 4")).start();
	}
}

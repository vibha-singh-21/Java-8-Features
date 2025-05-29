package com.learnJava.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String[] args) {
		/**
		 * prior java 8
		 */
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2); // o1 > o2 == 1
											// o1 == o2 == 0
											// o1 < o2 == -1
			}
		};

		System.out.println("result of comarator : " + comparator.compare(3, 2));

		/**
		 * java 8
		 */

		Comparator<Integer> c1 = (a, b) -> a.compareTo(b);

		System.out.println("result of comparator2 : " + c1.compare(3, 2));

	}

}

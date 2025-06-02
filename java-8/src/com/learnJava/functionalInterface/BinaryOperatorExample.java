package com.learnJava.functionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	static BinaryOperator<Integer> bo = (a, b) -> a * b;

	static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);

	public static void main(String[] args) {
		System.out.println(bo.apply(4, 5));

		BinaryOperator<Integer> binaryOperator = BinaryOperator.maxBy(comparator);
		System.out.println("maxby result : " + binaryOperator.apply(4, 5));

		BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
		System.out.println("minby result : " + minBy.apply(4, 5));

	}

}

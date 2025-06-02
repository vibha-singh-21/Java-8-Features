package com.learnJava.functionalInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	static UnaryOperator<String> u = (s) -> s.concat(" default");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(u.apply("java 8"));
	}

}

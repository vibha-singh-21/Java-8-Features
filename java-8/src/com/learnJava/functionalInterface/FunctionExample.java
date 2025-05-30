package com.learnJava.functionalInterface;

import java.util.function.Function;

public class FunctionExample {

	static Function<String, String> f = (name) -> name.toUpperCase();
	
	static Function<String, String> addString = (name) -> name.concat(" default");

	public static void main(String[] args) {

		System.out.println(f.apply("java 8"));
		
		System.out.println(f.andThen(addString).apply("java 8"));
		
		System.out.println(f.compose(addString).apply("java 8"));
	}

}

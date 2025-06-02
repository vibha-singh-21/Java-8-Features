package com.learnJava.methodReference;

import java.util.function.Function;

public class MethodReferenceExample {

	static Function<String, String> toUppercaseLambda = (s) -> s.toUpperCase();

	static Function<String, String> toUpperMethodReference = String::toUpperCase;

	public static void main(String[] args) {
		System.out.println(toUppercaseLambda.apply("java 8"));

	}

}

package com.learnJava.functionalInterface;

public class FunctionExample1 {

	public static String performConcat(String str) {
		return FunctionExample.addString.apply(str);
	}

	public static void main(String[] args) {
		System.out.println("result : " + performConcat("Hello"));
	}

}

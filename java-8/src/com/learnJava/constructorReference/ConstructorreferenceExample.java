package com.learnJava.constructorReference;

import java.util.function.Function;
import java.util.function.Supplier;

import com.learnJava.data.Student;

public class ConstructorreferenceExample {

	static Supplier<Student> studentSupplier = Student::new;

	static Function<String, Student> studentFunction = Student::new;

	public static void main(String[] args) {
		System.out.println(studentSupplier.get());
		System.out.println(studentFunction.apply("abc"));
	}

}

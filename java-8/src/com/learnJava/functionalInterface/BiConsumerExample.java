package com.learnJava.functionalInterface;

import java.util.List;
import java.util.function.BiConsumer;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class BiConsumerExample {

	static BiConsumer<String, List<String>> b2 = (name, activities) -> {
		System.out.println(name + " : " + activities);
	};

	public static void printNameAndActivities() {
		List<Student> list = StudentDataBase.getAllStudents();
		list.forEach((student -> b2.accept(student.getName(), student.getActivities())));
	}

	public static void main(String[] args) {
		BiConsumer<String, String> b1 = (a, b) -> {
			System.out.println("a : " + a + " , b : " + b);
		};

		b1.accept("java 7", "java 8");

		BiConsumer<Integer, Integer> multiply = (a, b) -> {
			System.out.println("Multiplication is : " + (a * b));
		};

		BiConsumer<Integer, Integer> division = (a, b) -> {
			System.out.println("Division is : " + (a / b));
		};

		multiply.andThen(division).accept(10, 5);

		printNameAndActivities();

	}

}

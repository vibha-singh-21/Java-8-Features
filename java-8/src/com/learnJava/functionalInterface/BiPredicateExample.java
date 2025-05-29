package com.learnJava.functionalInterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class BiPredicateExample {

	static BiPredicate<Integer, Double> biP = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;

	static BiConsumer<String, List<String>> b = (name, activities) -> System.out.println(name + " : " + activities);

	static Consumer<Student> c = (s -> {
		if (biP.test(s.getGradeLevel(), s.getGpa())) {
			b.accept(s.getName(), s.getActivities());
		}
	});

	public static void main(String[] args) {
		List<Student> list = StudentDataBase.getAllStudents();

		list.forEach(c);

	}

}

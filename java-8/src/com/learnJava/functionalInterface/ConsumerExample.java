package com.learnJava.functionalInterface;

import java.util.List;
import java.util.function.Consumer;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class ConsumerExample {

	static Consumer<Student> c = (s) -> System.out.println(s);
	static Consumer<Student> c1 = (s) -> System.out.print(s.getName());
	static Consumer<Student> c2 = (s) -> System.out.println(s.getActivities());

	public static void printStudents() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(c);
	}

	public static void printNameAndActivities() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(c1.andThen(c2));
	}

	public static void printNameAndActivitiesCondition() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		System.out.println("** Print Name and Activities using Condition : ");
		studentList.forEach(student -> {
			if (student.getGradeLevel() >= 3) {
				c1.andThen(c2).accept(student);
			}
		});
	}

	public static void main(String[] args) {

		Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());

		consumer.accept("java 8");
		printStudents();
		printNameAndActivities();
		printNameAndActivitiesCondition();

	}

}

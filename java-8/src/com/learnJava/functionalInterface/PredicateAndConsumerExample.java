package com.learnJava.functionalInterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class PredicateAndConsumerExample {

	Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
	Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

	BiConsumer<String, List<String>> b = (name, activities) -> System.out.println(name + " : " + activities);

	Consumer<Student> c = (s -> {
		if (p1.and(p2).test(s)) {
			b.accept(s.getName(), s.getActivities());
		}
	});

	public void printNameAndActivities(List<Student> list) {
		list.forEach(c);
	}

	public static void main(String[] args) {
		List<Student> list = StudentDataBase.getAllStudents();

		PredicateAndConsumerExample example = new PredicateAndConsumerExample();
		example.printNameAndActivities(list);

	}

}

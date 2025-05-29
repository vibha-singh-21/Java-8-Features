package com.learnJava.functionalInterface;

import java.util.List;
import java.util.function.Predicate;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class PredicateStudentExample {

	static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
	static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

	public static void filterStudentByGradeLevel() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(s -> {
			if (p1.test(s)) {
				System.out.println(s);
			}
		});
	}
	
	public static void filterStudentByGPA() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		System.out.println("##############");
		studentList.forEach(s -> {
			if (p2.test(s)) {
				System.out.println(s);
			}
		});
	}
	
	public static void filterStudentByGPAAndGradeLevel() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		System.out.println("%%%%%%%%%%%%%");
		studentList.forEach(s -> {
			if (p1.and(p2).test(s)) {
				System.out.println(s);
			}
		});
	}
	
	public static void filterStudentByGPAOrGradeLevel() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		System.out.println("@@@@@@@@@@@@");
		studentList.forEach(s -> {
			if (p1.or(p2).test(s)) {
				System.out.println(s);
			}
		});
	}

	public static void main(String[] args) {
		filterStudentByGradeLevel();
		filterStudentByGPA();
		filterStudentByGPAAndGradeLevel();
		filterStudentByGPAOrGradeLevel();
	}

}

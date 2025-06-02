package com.learnJava.methodReference;

import java.util.function.Predicate;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class RefactorMethodReferenceExample {

	static Predicate<Student> p1 = RefactorMethodReferenceExample::greaterThanGradelevel;

	public static boolean greaterThanGradelevel(Student s) {
		return s.getGradeLevel() >= 3;
	}

	public static void main(String[] args) {
		Student s = StudentDataBase.studentSupplier.get();
		System.out.println(p1.test(s));
	}

}

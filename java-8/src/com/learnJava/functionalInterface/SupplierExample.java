package com.learnJava.functionalInterface;

import java.util.List;
import java.util.function.Supplier;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();

		System.out.println(listSupplier.get());

	}

}

package com.example.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		
		Student s = new Student();
		list.add(new Student(1, "Michael", 20));
		list.add(new Student(2, "Daniel", 22));
		list.add(new Student(3, "Peter", 21));
		list.add(new Student(4, "John", 21));
		list.add(new Student(5, "George", 23));
		list.add(new Student(6, "Luna", 25));
		list.add(new Student(7, "Diona", 20));
		list.add(new Student(8, "Childe", 21));
		list.add(new Student(9, "Raven", 22));
		list.add(new Student(10, "Pott", 24));
		
		Collections.sort(list);
		
		// print list data		
		for(Student ss : list) {
			System.out.println("Student "+ss.toString());
		}
	}
}

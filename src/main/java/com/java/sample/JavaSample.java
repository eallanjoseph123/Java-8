package com.java.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaSample {

	public static void main(String[] args) {

		//forLoopAnd8loop();
		collection();
	}

	// For Loop And 8 loop
	static void forLoopAnd8loop() {
		int[] students = { 5, 4, 2, 1, 3 };

		for (int count = 0; count < students.length; count++) {

			System.out.print(students[count] + " ");
		}

		System.out.println();

		IntStream.of(students).forEach(student -> System.out.print(student + " "));

		Arrays.stream(students).forEach(student -> System.out.print(student + " "));

	}

	static void collection() {
		List<String> allStudents = new ArrayList<>();
		List<String> teachersName = new ArrayList<>();
		
		Teacher t1 = new Teacher("Hashirama",true,true);
		List<Student> students1 = new ArrayList<>();
		Student s1 = new Student("naruto", 30, 2.3);
		Student s2 = new Student("madara", 23, 4.3);
		students1.add(s1);
		students1.add(s2);
		t1.setStudents(students1);
		
		Teacher t2 = new Teacher("Kakashi",false,false);
		List<Student> students2 = new ArrayList<>();
		Student s3 = new Student("sasuske", 12, 2.3);
		Student s4 = new Student("hinata", 23, 4.3);
		Student s5 = new Student("robert", 15, 4.3);
		students2.add(s3);
		students2.add(s4);
		students2.add(s5);
		t2.setStudents(students2);
		
		
		List<Teacher> teachers = new ArrayList<>();
		teachers.add(t1);
		teachers.add(t2);
		
		
		for(Teacher teacher: teachers) {
			teachersName.add(teacher.getName());
		}
		
		
		List<String> teachersName2 = teachers.stream()
									.map(teacher->teacher.getName())
									.collect(Collectors.toCollection(LinkedList::new));
		
		
		
		for(Teacher teacher: teachers) {
			if(teacher.isPhd()) {
				System.out.println(teacher.getName());
			}
		}
		
		teachers.stream()
				.filter(Teacher::isPhd)
				.forEach(teacher->System.out.println(teacher.getName()));
		
		
	}
	


}

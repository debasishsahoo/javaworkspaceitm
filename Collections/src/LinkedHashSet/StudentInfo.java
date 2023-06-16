package LinkedHashSet;

import java.util.LinkedHashSet;

class Student {
	String name;
	int id;
	String city;

	Student(String name, int id, String city) {
		this.name = name;
		this.id = id;
		this.city = city;
	}
}

public class StudentInfo {
	public static void main(String[] args) {
		LinkedHashSet<Student> lhset = new LinkedHashSet<Student>();

// Creating objects of Students.
		Student st1 = new Student("John", 2345, "New York");
		Student st2 = new Student("Deep", 1234, "Dhanbad");
		Student st3 = new Student("Ricky", 7583, "Cape Town");

// Adding elements (object references) into LinkedHashSet.
		lhset.add(st1);
		lhset.add(st2);
		lhset.add(st3);

// Traversing linked hash set.
		for (Student s : lhset) {
			System.out.println("Name: " + s.name + " " + "Id: " + s.id + " " + "City: " + s.city);
		}
	}
}
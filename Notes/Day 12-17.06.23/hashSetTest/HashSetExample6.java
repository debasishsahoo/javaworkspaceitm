package hashSetTest;

import java.util.HashSet;

class Student {
// Declare instance variables.
	String name, sName;
	int id;

	public Student(String name, String sName, int id) {
		this.name = name;
		this.sName = sName;
		this.id = id;
	}
}

public class HashSetExample6 {
	public static void main(String[] args) {
// Create a user-defined HashSet object of type Student.
		HashSet<Student> hset = new HashSet<Student>();

// Create objects of Student class and pass the parameters to their constructors.
		Student s1 = new Student("John", "RSVM", 0012);
		Student s2 = new Student("Shubh", "DPS", 1234);
		Student s3 = new Student("Ricky", "DAV", 9876);

// Adding elements to HashSet and pass reference variables s1, s2, s3.
		hset.add(s1);
		hset.add(s2);
		hset.add(s3);

// Traversing HashSet.
		for (Student s : hset) {
			System.out.println(s.name + " " + s.sName + " " + s.id);
		}
	}
}

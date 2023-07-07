package HashTable.Comparator;

import java.util.*;

import HashTable.Comparable.Student;

import java.io.*;

class Simple {
	public static void main(String args[]) {

		ArrayList al = new ArrayList();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		System.out.println("Sorting by Name");

		Collections.sort(al, new NameComparator());
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("Sorting by age");

		Collections.sort(al, new AgeComparator());
		Iterator itr2 = al.iterator();
		while (itr2.hasNext()) {
			Student st = (Student) itr2.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}
}
package HashTable.Comparable;

import java.util.*;

public class TestSort {
	public static void main(String args[]) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Arun", 10));
		al.add(new Student(106, "Bali", 16));
		al.add(new Student(105, "Chandan", 15));

		Collections.sort(al);
		
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}
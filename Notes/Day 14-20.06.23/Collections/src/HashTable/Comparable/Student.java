package HashTable.Comparable;

public class Student implements Comparable<Student> {
	public int rollno;
	public String name;
	public int age;

	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;

	}
	
	 @Override public int compareTo(Student st) {
		 if (age == st.age) return 0;
	  else if (age > st.age) return 1;
	  else return -1;
		 }
	 
	
	
	
	
	
	 
	 
	 
	 
	 
	 
	 
	/*@Override
	public int compareTo(Student st) {
		if (age == st.age)
			return 0;
		else if (age < st.age)
			return 1;
		else
			return -1;*/
	//}

}

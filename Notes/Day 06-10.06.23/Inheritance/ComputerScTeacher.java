package Inheritance;

public class ComputerScTeacher extends Teacher {

	String mainSubject = "CompSc";

	public static void main(String args[]) {
		ComputerScTeacher obj = new ComputerScTeacher();
		// accessing the fields of parent class
		System.out.println(obj.collegeName);
		System.out.println(obj.designation);

		System.out.println(obj.mainSubject);

		// accessing the method of parent class
		obj.profession();

	
	}
}

package staticArea;

public class StaticMethod {

	static String studentName;
	static int age;

	public static void displayStudentDetails() {
		studentName = "Dev";
		StaticMethod.age = 22;
		System.out.println("Student Name : " + studentName + " Age : " + age);
	}
	
	  void displayStudentDetails2() {
		studentName = "Debasish";
		StaticMethod.age = 32;
		System.out.println("Student Name : " + studentName + " Age : " + age);
	}

	public static void main(String args[]) {
		StaticMethod.displayStudentDetails();
		StaticMethod.displayStudentDetails2();
	}

}

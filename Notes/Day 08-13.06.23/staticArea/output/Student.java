package staticArea.output;

public class Student {

	int roll;
	  String name;
	  static String college = "ITM";

	  Student(int r, String n) {
	    roll = r;
	    name = n;
	  }

	  void display() {
	    System.out.println(roll + " " + name + " " + college);
	  }

	  public static void main(String args[]) {
	    Student s1 = new Student(111, "Debasish");
	    Student s2 = new Student(222, "Sumit");
	    s1.display();
	    s2.display();
	    //we can change the college of all objects by the 
	    //single line of code
	    Student.college = "ITM UNIVERSITY";
	    s1.display();
	    s2.display();
	  }
}

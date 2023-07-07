package staticArea.output;

public class Student2 {

	  //A static method belongs to the class rather than the object of a class.

	  //A static method can be invoked without the need for creating an instance of a class.

	  //A static method can access static data member and can change the value of it.

	  int roll;
	  String name;
	  static String college = "ITM";

	  static void change() {
	    college = "ITM UNIVERSITY";
	  }

	  Student2(int r, String n) {
	    roll = r;
	    name = n;
	  }

	  void display() {
	    System.out.println(roll + " " + name + " " + college);
	  }

	  public static void main(String args[]) {
		  
	    Student2.change();
	    
	    Student s1 = new Student(111, "Vikrant");
	    Student s2 = new Student(222, "Debasish");
	    Student s3 = new Student(333, "Sumit");
	    s1.display();
	    s2.display();
	    s3.display();
	  }
	}

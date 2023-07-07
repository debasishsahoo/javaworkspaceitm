package staticArea;

public class StaticVariable {
	static String studentName;
	static int age;
	
	StaticVariable(String s,int a){
		this.studentName=s;
		this.age=a;
	}
	public void Display() {
		System.out.println("Student Name : " + studentName + " Age : " + age);
	}
	
	
	/*
	 * public String getStudentName() { return studentName; }
	 * 
	 * public void setStudentName(String studentName) { this.studentName =
	 * studentName; }
	 * 
	 * public int getAge() { return age; }
	 * 
	 * public void setAge(int age) { this.age = age; }
	 */
	

	public static void main(String args[]) {
		StaticVariable s1 = new StaticVariable("Debasish",22);
		
		StaticVariable s2 = new StaticVariable("Dev",32);
		
		StaticVariable s3 = new StaticVariable("Debasish Sahoo",42);
		s1.Display();
		s2.Display();
		s3.Display();
		
		
		
		/*
		 * StaticVariable s1 = new StaticVariable(); s1.setStudentName("Debasish");
		 * s1.setAge(22); StaticVariable s2 = new StaticVariable();
		 * s1.setStudentName("Dev"); s1.setAge(32); StaticVariable s3 = new
		 * StaticVariable(); s1.setStudentName("Debasish Sahoo"); s1.setAge(42);
		 * s1.Display(); s2.Display(); s3.Display();
		 */
	}
}

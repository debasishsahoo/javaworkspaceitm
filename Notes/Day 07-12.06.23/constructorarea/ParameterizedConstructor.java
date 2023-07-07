package constructorarea;

public class ParameterizedConstructor {
	int empId;
	String empName;

	// parameterized constructor with two parameters
	ParameterizedConstructor(int id, String name){  
	       this.empId = id;  
	       this.empName = name;  
	   }

	void info() {
		System.out.println("Id: " + empId + " Name: " + empName);
	}

	public static void main(String[] args) {
		ParameterizedConstructor obj1 = new ParameterizedConstructor(10245,"Dev");  
		ParameterizedConstructor obj2 = new ParameterizedConstructor(92232,"Debasish");  
		obj1.info();  
		obj2.info();  
	}

}

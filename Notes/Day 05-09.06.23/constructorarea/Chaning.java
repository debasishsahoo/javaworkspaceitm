package constructorarea;

public class Chaning {
	public String empName;
	public int empSalary;
	public String address;

	// default constructor of the class
	public Chaning()
    {
    	//this will call the constructor with String param
        this("Debasish");
    }

	public Chaning(String name)
    {
    	//call the constructor with (String, int) param
    	this(name, 120035);
    }

	public Chaning(String name, int sal)
    {
    	//call the constructor with (String, int, String) param
    	this(name, sal, "Gurgaon");
    }

	public Chaning(String name, int sal, String addr)
    {
    	this.empName=name;
    	this.empSalary=sal;
    	this.address=addr;
    }

	void disp() {
		System.out.println("Chaning Name: " + empName);
		System.out.println("Chaning Salary: " + empSalary);
		System.out.println("Chaning Address: " + address);
	}

	public static void main(String[] args) {
		Chaning obj = new Chaning();
	    obj.disp();
	}

}

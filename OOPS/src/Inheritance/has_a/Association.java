package Inheritance.has_a;

public class Association {
	public static void main (String[] args) 
    { 
        Bank b = new Bank("Axis"); 
        Employee e = new Employee("Himanshi"); 
        System.out.println(e.getEmployeeName() + 
            " is an employee of " + b.getBankName()); 
    }
}

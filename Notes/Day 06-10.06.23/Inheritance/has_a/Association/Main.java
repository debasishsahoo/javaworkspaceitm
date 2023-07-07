package Inheritance.has_a.Association;

import java.util.ArrayList;
import java.util.List;

class Main {
	public static void main(String[] args) {

		// Create two professor objects
		Professor ak = new Professor("Arun Kumar");
		Professor ry = new Professor("Rahul Yadav");

		// Create a department
		Department cse = new Department("CSE");

		// Add the professors to a list and add this list to department
		List<Professor> staff_cse = new ArrayList<Professor>();
		staff_cse.add(ak);
		staff_cse.add(ry);

		// Add staff to cse department
		cse.setStaff(staff_cse);

		// Output

		System.out.println("The staff of department " + cse.getName() + " is: " + cse.getStaff());

	}
}

package Inheritance.has_a.Association;

import java.util.ArrayList;
import java.util.List;

//Department Class
class Department {
	private String name;
	List<Professor> staff;

//Assign department name
	Department(String name) {
		this.name = name;
	}

//Retrieve name
	public String getName() {
		return this.name;
	}

//Assign list of department staff
	public void setStaff(List<Professor> staff) {
		this.staff = staff;
	}

//Return the list of staff names
	public List<String> getStaff() {

		List<String> professor_names = new ArrayList<String>();
		for (Professor prof : this.staff) {
			professor_names.add(prof.getName()); // add name of each professor to names list
		}
		return professor_names; // return names list
	}
}
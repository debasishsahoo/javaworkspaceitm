package Inheritance.has_a;

public class StudentArea {
	
	public int id;
	public String Name;
	public int Age;
	public AddressArea Address;
	
	public StudentArea(int i,String n,int a,AddressArea add) {
		this.id=i;
		this.Name=n;
		this.Age=a;
		this.Address=add;
		
	}

	public static void main(String[] args) {
		AddressArea AddressObj=new AddressArea(11,"School Row","Bhowanipur","Kolkata","WB",700025);
		
		StudentArea StudentObj=new StudentArea(100,"Debasish",32, AddressObj);
		
		
		System.out.println(StudentObj.id);
		System.out.println(StudentObj.Name);
		System.out.println(StudentObj.Age);
		System.out.println(StudentObj.Address.House_No);
		System.out.println(StudentObj.Address.House_Street);
		System.out.println(StudentObj.Address.LandMark);
		System.out.println(StudentObj.Address.City);
		System.out.println(StudentObj.Address.State);
		System.out.println(StudentObj.Address.Zip);
		
	}

}

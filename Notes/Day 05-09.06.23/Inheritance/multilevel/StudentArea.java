package Inheritance.multilevel;

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

	}

}

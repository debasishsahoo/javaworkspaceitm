package polymorphism.RuleOfOverRide;

class SuperClass2 {
	public Object method()
	{
		System.out.println("This is the method in SuperClass");
		return new Object();
	}
}

class SubClass2 extends SuperClass2 {
	public String method()
	{
		System.out.println("This is the method in SubClass");
		return "Hello, World!";
	}
}


public class ReturnTypeOverRide {

	public static void main(String[] args) {
		SuperClass2 obj1 = new SuperClass2();
		obj1.method();

		SubClass2 obj2 = new SubClass2();
		obj2.method();

	}

}

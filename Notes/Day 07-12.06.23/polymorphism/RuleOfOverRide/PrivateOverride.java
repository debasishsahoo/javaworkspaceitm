package polymorphism.RuleOfOverRide;

class SuperClass {
	private void privateMethod() {
		System.out.println("This is a private method in SuperClass");
	}

	public void publicMethod() {
		System.out.println("This is a public method in SuperClass");
		privateMethod();
	}
}

class SubClass extends SuperClass {
	private void privateMethod() {
		System.out.println("This is a private method in SubClass");
	}
	public void publicMethod() {
		System.out.println("This is a public method in SubClass");
		privateMethod();
	}
}

public class PrivateOverride {

	public static void main(String[] args) {
		SuperClass obj1 = new SuperClass();
		obj1.publicMethod();
		
		SubClass obj2 = new SubClass();
		obj2.publicMethod();

	}

}

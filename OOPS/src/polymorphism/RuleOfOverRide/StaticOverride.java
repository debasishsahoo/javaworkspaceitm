package polymorphism.RuleOfOverRide;

class Parent3 {

	static void m1() {
		System.out.println("From parent " + "static m1()");
	}

	void m2() {
		System.out.println("From parent " + "non - static(instance) m2() ");
	}
}

class Child3 extends Parent3 {
	static void m1() {
		System.out.println("From child static m1()");
	}
	
	@Override
	public void m2() {
		System.out.println("From child " + "non - static(instance) m2() ");
	}
}

public class StaticOverride {

	public static void main(String[] args) {
		Parent3 obj1 = new Child3();
		obj1.m1();
		obj1.m2();
	}

}

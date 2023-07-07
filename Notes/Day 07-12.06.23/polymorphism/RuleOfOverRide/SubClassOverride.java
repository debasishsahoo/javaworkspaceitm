package polymorphism.RuleOfOverRide;

class Parent4 {
	void show() {
		System.out.println("Parent's show()");
	}
}

class Child4 extends Parent4 {

	@Override
	void show() {
		super.show();
		System.out.println("Child's show()");
	}
}

public class SubClassOverride {

	public static void main(String[] args) {
		Parent4 obj = new Child4();
		obj.show();
	}

}

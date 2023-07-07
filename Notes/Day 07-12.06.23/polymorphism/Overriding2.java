package polymorphism;

class Parent {
	void show() {
		System.out.println("Parent's show()");
	}
}

class Child extends Parent {
	@Override
	void show() {
		System.out.println("Child's show()");
	}
}


public class Overriding2 {

public static void main(String[] args) {
		
		Parent obj1 = new Parent();
		obj1.show();
		
		Parent obj2 = new Child();
		obj2.show();
	}
}

package finalArea.Classes;

final class Parent {

	public final void Display1() {
		System.out.println("Display1() method of parent class");
	}

	public final void Display2() {
		System.out.println("Display2() method of parent class");
	}
}

class Child extends Parent {
	public final void Display1() {
		System.out.println("Display1() method of Child class");
	}

	public final void Display2() {
		System.out.println("Display2() method of Child class");
	}
}

public class Main {

	public static void main(String[] args) {
		

	}

}

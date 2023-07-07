package staticArea;

class Base {
	public static void display() {
		System.out.println("Welcome to Base Class");
	}
}

public class StaicOverride extends Base {

	public static void display() {
		System.out.println("Welcome to Derived class");
	}

	public static void main(String args[]) {
		// Assign Child class object to Parent reference
		Base po = new StaicOverride();
		po.display();

		// As per overriding in Java,
		// the display() method of the Child class should be
		// called, since it is a static method overriding
		// will not happen here and hence
		// the Parent class display() method is called here.

		StaicOverride co = new StaicOverride();
		co.display();
	}

}

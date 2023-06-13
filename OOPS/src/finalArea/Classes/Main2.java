package finalArea.Classes;

class Parent2 {
	// final Parent() {}
	public final void Display1() {
		System.out.println("Display1() method of parent class");
	}

	public final void Display2() {
		System.out.println("Display2() method of parent class");
	}

	public final void Add(int a, int b) {
		System.out.println(a + b);
	}

	public final void Add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}

class Child2 extends Parent2 {
	
	  public void Display1() {
	  System.out.println("Display() method of child class"); }
	 
}

public class Main2 {

	public static final void main(String args[]) {
		Child c = new Child();
		c.Display2();
	}

}

package recursion;

public class Recursion1 {
	static void display() {
		System.out.println("Hello world");
		display(); // recursive call
	}

	public static void main(String[] args) {
		display(); // normal method call
	}
}

package staticArea.output;

public class Restrictions {

	// The static method can not use 
	//non static data member or call non-static
	// method directly.
	// this and super cannot be used in static context.

	int a = 40; // non static
	static int b; // static

	Restrictions(int x) {
		this.b = x;
	}

	// Why is the Java main method static?

	public static void main(String args[]) {

		System.out.println(a);

		Restrictions Pobj = new Restrictions(23);
	}
}

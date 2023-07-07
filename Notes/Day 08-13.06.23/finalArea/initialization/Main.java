package finalArea.initialization;

public class Main {
	// Blank final variable
	final int a;
	static final int b;
	final String c;

	// Instance Initialization Block
	{a = 5;}
	// Static Initialization Block
	static {b = 10;}

	Main() { c = "Debasish"; }
	 

	public static void main(String[] args) {
		Main Obj = new Main();
		System.out.println("a is :" + Obj.a);
		System.out.println("b is :" + b);
		System.out.println("c is :" + Obj.c);
		final int d;
		d = 90;
		System.out.println("d is :" + d);

	}

}

package polymorphism;

public class Add2 {
	void sum(int a, int b) {
		System.out.println("int arg method invoked");
	}

	void sum(long a, long b) {
		System.out.println("long arg method invoked");
	}

	public static void main(String args[]) {
		Add2 obj = new Add2();
		obj.sum(2000000, 20);// now int arg sum() method gets invoked
	
	}
}

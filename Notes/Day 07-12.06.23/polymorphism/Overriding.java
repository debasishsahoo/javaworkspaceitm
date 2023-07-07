package polymorphism;

class Base {
	void Msg() {
		System.out.println("This is Base class");
	}
}

class Overriding extends Base {
	void Msg() {
		System.out.println("This is Overriding class");
	}
	public static void main(String args[]) {
		Overriding obj = new Overriding();
		obj.Msg();
	}
}
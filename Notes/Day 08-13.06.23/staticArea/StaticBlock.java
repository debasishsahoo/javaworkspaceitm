package staticArea;

public class StaticBlock {

	static int i;

	static {
		System.out.println("Inside 1 static block");
		i = 10;
	}

	static {
		System.out.println("Inside 2 static block");
	}

	static {
		System.out.println("Inside 3 static block");
	}

	
	  public static void main(String args[]) { System.out.println(i); }
	 
}

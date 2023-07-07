package staticArea.output;

public class StaticBlock {
	  //Is used to initialize the static data member.
	  //It is executed before the main method at the
	//time of classloading.

	  static {
	    System.out.println("static block is invoked");
	  }

	  //Can we execute a program without main() method?
	  public static void main(String args[]) {
	    System.out.println("Hello main");
	  }
	}

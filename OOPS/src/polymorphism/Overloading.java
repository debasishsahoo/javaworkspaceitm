package polymorphism;

public class Overloading {

	  public void Display() {
	    System.out.println("Inside First Display method");
	  }

	  public void Display(String val) {
	    System.out.println("Inside Second Display method, value is: " + val);
	  }

	  public void Display(String val1, String val2) {
	    System.out.println(
	      "Inside Third Display method, values are : " + val1 + "," + val2
	    );
	  }

	  public void Display(int val1, int val2) {
	    System.out.println(
	      "Inside Forth Display method, values are : " + val1 + "," + val2
	    );
	  }

	  public void Display(double val1, double val2) {
	    System.out.println(
	      "Inside Fifth Display method, values are : " + val1 + "," + val2
	    );
	  }

	  public static void main(String args[]) {
	    Overloading oo = new Overloading();
	    oo.Display(); //Calls the first Display method
	    oo.Display("Dev"); //Calls the second Display method
	    oo.Display("Debasish", "Sahoo"); //Calls the third Display method
	    oo.Display(12, 14); //Calls the Fourth Display method
	    oo.Display(1.6, 1.9); //Calls the Fifth Display method
	  }
	}

package staticArea;

public class StaticMethodOverload {

	public static void Display() {
	    System.out.println("Display() method without parameter called");
	  }

	  public static void Display(String name) {
	    System.out.println("Display() method with parameter called : " + name);
	  }

	  public void Display(int a) {
	    System.out.println("Non static Display() method called");
	  }

	  public static void main(String args[]) {
		  StaticMethodOverload.Display();
		  StaticMethodOverload.Display("Dev");
		  StaticMethodOverload.Display(2);
		  
			/*
			 * StaticMethodOverload smo=new StaticMethodOverload(); smo.Display();
			 * smo.Display("Dev"); smo.Display(2);
			 */
	  }

}

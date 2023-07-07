package debugger;

public class Factorial {

	public static void main(String[] args) {
		int n = 5;          
	      int factorial = 1;   
	 
	      int i = 1;
	      while (i <= n) {
	         factorial = factorial * i;
	         i++;
	      }
	      System.out.println("The Factorial of " + n + " is " + factorial);

	}

}

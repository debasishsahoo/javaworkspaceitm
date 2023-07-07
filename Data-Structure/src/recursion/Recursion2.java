package recursion;

public class Recursion2 {
	static int count = 0;
	static void display()
	{  
	  count++;
	  if(count <= 5) // base case
	  {
	    System.out.println("Hello world");  
	    display(); // recursive call
	  }
	}  
	public static void main(String[] args) 
	{
	 display(); // normal method call
	  }
}

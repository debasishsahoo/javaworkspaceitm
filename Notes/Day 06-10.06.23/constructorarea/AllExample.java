package constructorarea;

public class AllExample {

	   //Default constructor
	   AllExample(){
	      System.out.println("Default constructor");
	   }
	   
	   
	   /* Parameterized constructor with 
	    * two integer arguments
	    */
	   AllExample(int i, int j){
	      System.out.println("constructor with Two parameters");
	   }
	   
	   
	   /* Parameterized constructor with 
	    * three integer arguments
	    */
	   AllExample(int i, int j, int k){
	      System.out.println("constructor with Three parameters");	      
	   }
		  
	   
	   
	   /* Parameterized constructor with 
	    * two arguments, int and String
	    */
	   AllExample(int i, String name){
	      System.out.println("constructor with int and String param");
	   }
	   
	   
	   public static void main(String args[]){
	      //This will invoke default constructor
	      AllExample obj = new AllExample();

	      
	      /* This will invoke the constructor 
	       * with two int parameters
	       */
	      AllExample obj2 = new AllExample(12, 12);

	      
	      /* This will invoke the constructor 
	       * with three int parameters
	       */
	      AllExample obj3 = new AllExample(1, 2, 13);
		
	      
	      /* This will invoke the constructor 
	       * with int and String parameters
	       */
	      AllExample obj4 = new AllExample(1,"deb");
	   }
}

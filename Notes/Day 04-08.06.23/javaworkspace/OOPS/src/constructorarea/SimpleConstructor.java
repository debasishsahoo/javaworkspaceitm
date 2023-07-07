package constructorarea;

public class SimpleConstructor {
	String name;
	
	   SimpleConstructor(){
	      this.name = "Debasish Sahoo";
	   }
	public static void main(String[] args) {
		  SimpleConstructor obj = new SimpleConstructor();
	      System.out.println(obj.name);
	}

}

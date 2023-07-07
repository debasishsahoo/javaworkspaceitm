package polymorphism;

public class Add3 {
	void sum(int a,long b){
		System.out.println("a method invoked");}
	
	
	  void sum(long a,int b){
		  System.out.println("b method invoked");}  
	  
	  
	  public static void main(String args[]){  
	  Add3 obj=new Add3();  
	  obj.sum(96,20);//now ambiguity  
	  }  
}

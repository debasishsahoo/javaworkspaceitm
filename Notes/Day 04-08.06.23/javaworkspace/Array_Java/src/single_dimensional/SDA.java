package single_dimensional;

public class SDA {

	public static void main(String[] args) {
		//array declaration
		
	    String names[] = new String[5];

	    //array initialization
	    names[0]="Chaitanya";
	    names[1]="Ajeet";
	    names[2]="Rahul";
	    names[3]="Shivam";
	    names[4]="Rohit";
	    
	    System.out.println("Name[0]- "+ names[0]);
	    System.out.println("Name[1]- "+ names[1]);
	    System.out.println("Name[2]- "+ names[2]);
	    System.out.println("Name[3]- "+ names[3]);
	    System.out.println("Name[4]- "+ names[4]);
		
	    System.out.println("-------------------------------");

	    //print array elements
	    for(int i=0;i<names.length;i++)
	      System.out.println("names["+i+"]: "+names[i]);

	}

}

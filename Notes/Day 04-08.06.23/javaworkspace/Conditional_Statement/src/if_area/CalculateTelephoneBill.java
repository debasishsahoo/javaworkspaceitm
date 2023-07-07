package if_area;
import java.util.Scanner;
public class CalculateTelephoneBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n,totalbill=200;
        
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the no of calls");

		n=sc.nextDouble();	

		if(n>100 &&n<=150)
		{
		 totalbill=totalbill+((n-100)*0.6);	
		}
		else if(n>150 && n<=200)
		{
		totalbill=totalbill+((n-100)*0.6+(n-150)*0.5);
		}
		else if(n>200)
	        {				
		totalbill=totalbill+((n-100)*0.6+(n-150)*0.5+(n-200)*0.4);
	        }

		System.out.println("total bill is"+totalbill+"rs");
		 
	}

}

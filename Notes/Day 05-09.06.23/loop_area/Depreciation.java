package loop_area;
import java.util.Scanner;
public class Depreciation {

	public static void main(String[] args) {
		 long amount,deppercent,year,temp;
		 
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter Amount(Whole Number):");
		 amount = input.nextLong();
		 
		 System.out.print("Enter deppercent:");
		 deppercent = input.nextLong();
		 
		 System.out.print("Enter Year:");
		 year = input.nextLong();
		 
		 temp=amount;
		 for(int i=0;i<year;i++)
		 temp=((100-deppercent)*temp)/100;
		 System.out.println("after depreciation = "+temp);
		

	}

}

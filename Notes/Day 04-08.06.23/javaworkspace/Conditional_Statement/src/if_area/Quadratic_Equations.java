package if_area;
import java.util.Scanner;
public class Quadratic_Equations {
	/*
	 * @formula: [-b±√(b2-4ac)]/2a
	 * 
	 * 
	 * 
	 * */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = input.nextDouble();
        
        System.out.print("Input b: ");
        double b = input.nextDouble();
        
        System.out.print("Input c: ");
        double c = input.nextDouble();
        
        double result = b * b - 4.0 * a * c;
        
        if (result > 0.0) {
            double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
            
        } else if (result == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
            
        } else {
            System.out.println("The equation has no real roots.");
        }

	}

}

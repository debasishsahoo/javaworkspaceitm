package loop_area;
import java.util.Scanner;
public class GuessingGame {

	public static void main(String[] args) {
		int number = 8;
		int guess = 0;

		Scanner input = new Scanner(System.in);
		do {
		System.out.print("Enter a number between 1 and 10: ");
		guess = input.nextInt();
		} while (number != guess);

		System.out.println("You're correct!");

	}

}

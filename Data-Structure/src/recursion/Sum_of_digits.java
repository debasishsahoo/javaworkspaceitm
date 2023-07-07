package recursion;

public class Sum_of_digits {
	// Create a static method to check sum of its digits using recursion.
	static int getSum(int n) {
		if (n == 0)
			return 0;
		return (n % 10 + getSum(n / 10));
	}

	public static void main(String[] args) {
		int num = 12345;
		int result = getSum(num);
		System.out.println("Sum of digits of a number " + num + " = " + result);
	}
}

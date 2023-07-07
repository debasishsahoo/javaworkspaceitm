package recursion;
public class Factorial {
	static int fact_itr(int num) {
		if (num < 0)
			return num;
		int total = 1;
		for (int n = num; n > 1; n--) {
			total = total * n;
		}
		return total;
	}

	static int fact_rec(int num) {
		if (num == 1 || num == 0) // base case.
		{
			return 1;
		}
		return num * fact_rec(num - 1); // recursive call.
	}

	public static void main(String[] args) {
		System.out.println("The factorial of 5 is " + fact_itr(5));
		System.out.println("The factorial of 5 is " + fact_rec(5));
	}
}

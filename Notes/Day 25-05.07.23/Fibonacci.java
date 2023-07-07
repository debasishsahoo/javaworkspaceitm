package recursion;

public class Fibonacci {
	static int getFibo_itr(int num) {
		if (num <= 1)
			return num;
		int sum = 0;
		int last = 1;
		int last_last = 0;
		for (int i = 1; i < num; i++) {
			sum = last_last + last;
			last_last = last;
			last = sum;
		}
		return sum;
	}

	static int getFibo_rec(int num) {
		if (num <= 1) // base case.
		{
			return num;
		} else {
			return getFibo_rec(num - 1) + getFibo_rec(num - 2);
		}
	}

	public static void main(String[] args) {
		System.out.println("Sum of Fibonacci numbers: " + getFibo_itr(10));
		System.out.println("Sum of Fibonacci numbers: " + getFibo_rec(10));
	}
}

package recursion;

public class Recursion3 {
	static void countDown(int num) {
		if (num < 0) // base case. Stop at 0.
		{
			return; // stop function.
		} else {
			System.out.println(num);
			countDown(num - 1); // count down 1.
		}
	}

	public static void main(String[] args) {
		countDown(10); // calling method
	}
}

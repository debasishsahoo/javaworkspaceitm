package recursion;

public class Palindrome {
	static boolean checkPalindrome(String s, int left, int right) {
		if (left >= right) {
			return true;
		}
		if (s.charAt(left) != s.charAt(right)) {
			return false;
		}
		return checkPalindrome(s, left + 1, right - 1);
	}

	static void palindrome(int a) {
		String s = Integer.toString(a);
		int n = s.length();
		
		if (checkPalindrome(s, 0, n - 1)) {
			System.out.println("The number " + a + " is palindrome");
		} else {
			System.out.println("The number " + a + " is not palindrome");
		}
	}

	public static void main(String[] args) {
		palindrome(1235321);
		palindrome(12101201);
	}

}

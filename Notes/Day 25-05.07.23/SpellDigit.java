package recursion;

public class SpellDigit {
	static void spell_num(int number) {
		if (number < 10) // base case.
		{
			System.out.println(number);
		} else {
			spell_num((int) Math.floor(number / 10)); // recursive call.
			System.out.println(number % 10);
		}
	}

	public static void main(String[] args) {
		spell_num(789);
	}
}

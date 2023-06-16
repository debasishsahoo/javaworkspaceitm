public class TryCatchEx6 {
	public static void main(String[] args) {
		System.out.println("111");
		try {
			System.out.println("222");
			int y = 1 / 0;
		} catch (ArithmeticException e) {
			try {
				System.out.println("Hello");
				int x = 20 / 0;
			} catch (NullPointerException np) {
				System.out.println("333");
			}
		}
		System.out.println("444");
	}
}
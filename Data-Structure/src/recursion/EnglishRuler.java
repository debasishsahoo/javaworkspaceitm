package recursion;

public class EnglishRuler {
	public static void main(String[] args) {
		System.out.println("Rule:2,4");
		drawRuler(2, 4);
//		System.out.println("Rule:1,5");
//		drawRuler(1, 5);
//		System.out.println("Rule:3,3");
//		drawRuler(3, 3);
	}

	public static void drawRuler(int nInches, int majorLength) {
		drawLine(majorLength, 0);
		for (int j = 1; j <= nInches; j++) {
			drawInterval(majorLength - 1);
			drawLine(majorLength, j);
		}
	}

	private static void drawInterval(int centralLength) {
		if (centralLength >= 1) {
			drawInterval(centralLength - 1);
			drawLine(centralLength);
			drawInterval(centralLength - 1);
		}
	}

	private static void drawLine(int tickLength, int tickLabel) {
		for (int j = 0; j < tickLength; j++)
			System.out.print("-");
		if (tickLabel >= 0)
			System.out.print(" " + tickLabel);
		System.out.print("\n");
	}

	private static void drawLine(int tickLength) {
		drawLine(tickLength, -1);
	}

}

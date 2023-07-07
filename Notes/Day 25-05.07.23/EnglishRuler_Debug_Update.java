package recursion;

public class EnglishRuler_Debug_Update {
	private static boolean DEBUG = true;
	private static String indentText = "";

	public static void main(String[] args) {
		drawRuler(1, 3);
	}

	public static void drawRuler(int nInches, int majorLength) {
		debugPrint("drawRuler(" + nInches + ", " + majorLength + ")");
		drawLine(majorLength, 0);
		for (int j = 1; j <= nInches; j++) {
			drawInterval(majorLength - 1);
			drawLine(majorLength, j);
		}
	}

	private static void drawInterval(int centralLength) {
		indent();
		debugPrint("drawInterval(" + centralLength + ")");
		if (centralLength >= 1) {
			drawInterval(centralLength - 1);
			drawLine(centralLength);
			drawInterval(centralLength - 1);
		}
		dedent();
	}

	private static void drawLine(int tickLength, int tickLabel) {
		indent();
		debugPrint("drawLine(" + tickLength + ", " + tickLabel + ")");
		for (int j = 0; j < tickLength; j++)
			System.out.print("-");
		if (tickLabel >= 0)
			System.out.print(" " + tickLabel);
		System.out.print("\n");
		dedent();
	}

	private static void drawLine(int tickLength) {
		indent();
		debugPrint("drawLine(" + tickLength + ")");
		drawLine(tickLength, -1);
		dedent();
	}

	private static void debugPrint(String message) {
		if (DEBUG)
			System.out.println(indentText + message);
	}

	private static void indent() {
		indentText += "  ";
	}

	private static void dedent() {
		indentText = indentText.substring(2);
	}
}

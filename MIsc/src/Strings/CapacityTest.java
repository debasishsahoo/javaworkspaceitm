package Strings;

public class CapacityTest {
	public static void main(String[] args) {
// Create a StringBuffer object.
		StringBuffer sb = new StringBuffer();
		int length = sb.length();
		int capacity = sb.capacity();

		System.out.println("Before adding any character:");
		System.out.println("Length = " + length); // length = 0
		System.out.println("Default initial capacity =  " + capacity); // Capacity = 16

// Adding 16 characters in the existing string buffer object.
		sb.append("abcdefghijklmnop");

		System.out.println("After adding 16 characters:");
		System.out.println("Length =  " + sb.length()); // now length is 16.
		System.out.println("Capacity =  " + sb.capacity()); // still capacity is 16.

// Now add the 17th character in the existing string buffer object.
		sb.append("q");

		System.out.println("After adding 17th character:");
		System.out.println("Length =  " + sb.length()); // length is 17
		System.out.println("Capacity =  " + sb.capacity()); // capacity is 34

// Add 17 characters to the existing object.
		sb.append("abcdefghijklmnopq"); // 17 characters. So, total = 34 characters.

// Adding 35th character.
		sb.append("r");

		System.out.println("After adding 35th character:");
		System.out.println("Length =  " + sb.length()); // length is 35
		System.out.println("Capacity =  " + sb.capacity()); // Capacity is 70
	}
}
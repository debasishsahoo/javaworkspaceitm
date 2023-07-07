package problams;

/**
 * A Test Driver for the Time class
 */
public class TestTime {

	public static void main(String[] args) {
		// Test Constructors and toString()
		Time t1 = new Time(1, 2, 3);
		System.out.println(t1); // toString()
		// 03:02:01
		Time t2 = new Time(); // The default constructor
		System.out.println(t2);
		// 00:00:00

		// Test Setters and Getters
		t1.setHour(4);
		t1.setMinute(5);
		t1.setSecond(6);
		System.out.println(t1); // run toString() to inspect the modified instance
		// 04:05:06
		System.out.println("Hour is: " + t1.getHour());
		// Hour is: 4
		System.out.println("Minute is: " + t1.getMinute());
		// Minute is: 5
		System.out.println("Second is: " + t1.getSecond());
		// Second is: 6

		// Test setTime()
		t1.setTime(58, 59, 23);
		System.out.println(t1);
		// 23:59:58

		// Test nextSecond() and chaining
		System.out.println(t1.nextSecond()); // Return an instance of Time. Invoke Time's toString()
		// 23:59:59
		System.out.println(t1.nextSecond().nextSecond().nextSecond().nextSecond().nextSecond().nextSecond().nextSecond().nextSecond().nextSecond()); // chaining
		// 00:00:02
	}

}

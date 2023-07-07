package problams;

/**
 * A test driver program for the Student class.
 */
public class TestStudent {
	public static void main(String[] args) {
		// Test constructor and toString()
		Student ahTeck = new Student("Tan Ah Teck", "1 Happy Ave");
		System.out.println(ahTeck); // toString()
		// Tan Ah Teck(1 Happy Ave)

		// Test Setters and Getters
		ahTeck.setAddress("8 Kg Java");
		System.out.println(ahTeck);
		// Tan Ah Teck(8 Kg Java)
		System.out.println(ahTeck.getName());
		// Tan Ah Teck
		System.out.println(ahTeck.getAddress());
		// 8 Kg Java

		// Test addCourseGrade(), printGrades() and getAverageGrade()
		ahTeck.addCourseGrade("IM101", 89);
		ahTeck.addCourseGrade("IM102", 57);
		ahTeck.addCourseGrade("IM103", 96);
		ahTeck.printGrades();
		// Tan Ah Teck IM101:89 IM102:57 IM103:96
		System.out.printf("The average grade is %.2f%n", ahTeck.getAverageGrade());
		// The average grade is 80.67
	}
}

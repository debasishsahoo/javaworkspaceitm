package Sort;

public class Bubble1 {
	static void bubbleSort(int a[]) {
		int len = a.length; // calculating the length of array
		for (int i = 0; i < len - 1; i++)
			for (int j = 0; j < len - i - 1; j++)
				if (a[j] > a[j + 1]) // comparing the pair of elements
				{
					// swapping a[j+1] and a[i]
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
	}

	/* Prints the array */
	static void printArray(int a[]) {
		int len = a.length;
		for (int i = 0; i < len; i++)
			System.out.print(a[i] + " "); // printing the sorted array

		System.out.println();
	}

	// Main method to test above
	public static void main(String args[]) {
		int arr[] = { 28, 6, 4, 2, 24 };
		System.out.println("Array Before Sort:");
		printArray(arr);
		
		
		bubbleSort(arr);// calling the bubbleSort function

		
		System.out.println("Array After Sort:");
		printArray(arr); // calling the printArray function
	}
}

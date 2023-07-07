package Sort;

public class Bubble2 {
	static void bubbleSort(int a[]) {
		int len = a.length; // calculating the length of array
		for (int i = 0; i < len - 1; i++) {
			// for optimization when array is already sorted & no swapping happens
			boolean swapped = false;
			for (int j = 0; j < len - i - 1; j++) {
				if (a[j] > a[j + 1]) // comparing the pair of elements
				{
					// swapping a[j+1] and a[i]
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					// swapping happened so change to true
					swapped = true;
				}
			}

			// if no swaps happened in any of the iteration
			// array has become sorted so stop with the passes
			if (swapped == false)
				System.out.println("Array is Sorted:");
				break;

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
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		
		System.out.println("Array Before Sorting:");
		printArray(arr); // calling the printArray function
		

		bubbleSort(arr);// calling the bubbleSort function

		
		System.out.println("Array After Sorting:");
		printArray(arr); // calling the printArray function
	}
}

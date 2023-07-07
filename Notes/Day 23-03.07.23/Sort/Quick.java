package Sort;

public class Quick {
	// this function display the array
	public static void printArray(int[] arr, int size) {
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// main function of the program
	public static void main(String[] args) {
		int[] a = { 12, 11, 13, 5, 6, 7 };

		int size = a.length;
		System.out.println("Array Before Sort:");
		printArray(a, size);

		quickSort(a, 0, size - 1);

		System.out.println("Array After Sort:");
		printArray(a, size);
	}

	// A utility function to swap two elements
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// Recursive function to apply quickSort
	static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			/*
			 * indexPI is partitioning index, partition() function will return index of
			 * partition
			 */
			int indexPI = partition(arr, low, high);

			quickSort(arr, low, indexPI - 1); // left partition
			quickSort(arr, indexPI + 1, high); // right partition
		}
	}

	/*
	 * Partition function to do Partition elements on the left side of pivot
	 * elements would be smaller than pivot elements on the right side of pivot
	 * would be greater than the pivot
	 */
	static int partition(int[] arr, int low, int high) {
		// Pivot element selected as right most element in array each time.
		int pivot = arr[high];
		int swapIndex = (low - 1); // swapping index.

		for (int j = low; j <= high - 1; j++) {
			// Check if current element is smaller than pivot element.
			if (arr[j] < pivot) {
				swapIndex++; // increment swapping index.
				swap(arr, swapIndex, j);
			}
		}
		// swap swapindex+ 1 and pivot index
		// we assigned pivot = arr[high] is pivot index is high
		swap(arr, swapIndex + 1, high);

		return (swapIndex + 1);
	}
}

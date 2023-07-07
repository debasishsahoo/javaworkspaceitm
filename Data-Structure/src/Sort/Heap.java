package Sort;

public class Heap {
	// Main() for the execution of the program
	public static void main(String args[]) {
		int a[] = { 12, 11, 13, 5, 6, 7 };
		Heap ob = new Heap();
		ob.sort(a);

		System.out.println("Sorted array is");
		printArray(a);
	}

	public void sort(int a[]) {
		int len = a.length;

		// Build heap (rearrange array)
		for (int i = len / 2 - 1; i >= 0; i--)
			heapify(a, len, i);

		// One by one extract an element from heap
		for (int i = len - 1; i >= 0; i--) {
			// Move current root to end
			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;

			// call max heapify on the reduced heap
			heapify(a, i, 0);
		}
	}

	// To heapify a subtree rooted with node i which is
	// an index in arr[]. n is size of heap
	void heapify(int a[], int len, int i) {
		int largest = i; // Initialize largest as root
		int l = 2 * i + 1; // left = 2*i + 1
		int r = 2 * i + 2; // right = 2*i + 2

		// If left child is larger than root
		if (l < len && a[l] > a[largest])
			largest = l;

		// If right child is larger than largest so far
		if (r < len && a[r] > a[largest])
			largest = r;

		// If largest is not root
		if (largest != i) {
			int swap = a[i];
			a[i] = a[largest];
			a[largest] = swap;

			// Recursively heapify the affected sub-tree
			heapify(a, len, largest);
		}
	}

	/* A utility function to print array of size n */
	static void printArray(int a[]) {
		int len = a.length;
		for (int i = 0; i < len; ++i)
			System.out.print(a[i] + " ");
		System.out.println();
	}

}

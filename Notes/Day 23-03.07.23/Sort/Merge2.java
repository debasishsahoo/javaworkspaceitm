package Sort;

public class Merge2 {
	// this function display the array
	public static void printArray(int[] arr, int size) {
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// main function of the program
	public static void main(String[] args) {
		int[] a = { 12, 8, 4, 14, 36, 64, 15, 72, 67, 84 };

		int size = a.length;
		
		System.out.println("Array Before Sort:");
		printArray(a, size);

		mergeSort(a, 0, size - 1);
		
		System.out.println("Array After Sort:");
		printArray(a, size);
	}

	// this function apply merging and sorting in the array
	static void mergeSort(int[] a, int left, int right) {
		int mid;
		if (left < right) {
			// can also use mid = left + (right - left) / 2
			// this can avoid data type overflow
			mid = (left + right) / 2;

			// recursive calls to sort first half and second half sub-arrays
			mergeSort(a, left, mid);
			mergeSort(a, mid + 1, right);
			merge(a, left, mid, right);
		}
	}

	// after sorting this function merge the array
	static void merge(int[] a, int left, int mid, int right) {
		int i = left; // starting index of left sub-array
		int j = mid + 1; // starting index of right sub-array
		int index = left; // used to place items in temp[]
		int[] temp = new int[10];

		while (i <= mid && j <= right) {
			// place the smaller item at temp[index]
			if (a[i] < a[j]) {
				temp[index] = a[i];
				i = i + 1;
			} else {
				temp[index] = a[j];
				j = j + 1;
			}
			index++;
		}

		// i > mid would mean all items for left
		// sub-array were successfully placed, and there
		// must be unplaced right sub-array items
		if (i > mid) {
			while (j <= right) {
				temp[index] = a[j];
				index++;
				j++;
			}
		} else {
			while (i <= mid) {
				temp[index] = a[i];
				index++;
				i++;
			}
		}
		int p = left;

		while (p < index) {
			a[p] = temp[p];
			p++;
		}
	}

}

package Sort;

public class Merge1 {
	public static void printArray(int[] arr, int size) {
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
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
	static void merge(int[] arr, int left, int mid, int right) {
		int i, j, k;
		int n1 = mid - left + 1;
		int n2 = right - mid;

		// create temp arrays to store left and right sub-arrays
		int L[] = new int[n1];
		int R[] = new int[n2];

		// Copying data to temp arrays L[] and R[]
		for (i = 0; i < n1; i++)
			L[i] = arr[left + i];
		
		for (j = 0; j < n2; j++)
			R[j] = arr[mid + 1 + j];

		// here we merge the temp arrays back into arr[l..r]
		i = 0; // Starting index of L[i]
		j = 0; // Starting index of R[i]
		k = left; // Starting index of merged sub-array

		while (i < n1 && j < n2) {
			// place the smaller item at arr[k] pos
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		// Copy the remaining elements of L[], if any
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		// Copy the remaining elements of R[], if any
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	
	public static void main(String[] args) {
		int[] a = { 12, 8, 4, 14, 36, 64, 15, 72, 67, 84 };

		int size = a.length;
		
		System.out.println("Array Before Sort:");
		printArray(a, size);

		mergeSort(a, 0, size - 1);
		
		System.out.println("Array After Sort:");
		printArray(a, size);
	}
}

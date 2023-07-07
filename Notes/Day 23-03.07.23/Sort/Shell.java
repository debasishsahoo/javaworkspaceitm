package Sort;

public class Shell {
	// function for shell sort
	static void shellsort(int Array[]) {
		int n = Array.length;
		int gap = n / 2;
		int temp, i, j;
		while (gap > 0) {
			for (i = gap; i < n; i++) {
				temp = Array[i];
				j = i;
				while (j >= gap && Array[j - gap] > temp) {
					Array[j] = Array[j - gap];
					j = j - gap;
				}
				Array[j] = temp;
			}
			gap = gap / 2;
		}
	}

	// function to print array
	static void PrintArray(int Array[]) {
		int n = Array.length;
		for (int i = 0; i < n; i++)
			System.out.print(Array[i] + " ");
		System.out.println();
	}

	// test the code
	public static void main(String[] args) {
		int[] MyArray = { 10, 1, 23, 50, 4, 9, -4 };
		System.out.println("Original Array");
		PrintArray(MyArray);

		shellsort(MyArray);
		System.out.println("\nSorted Array");
		PrintArray(MyArray);
	}
}

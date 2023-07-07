package Search;

public class BinarySearch_Iterative {
	public static int binarySearch(int arr[], int left, int right, int item) {

		while (left <= right) {
			int mid = left + (right - left) / 2;

			// if item is at mid
			if (arr[mid] == item)
				return mid;

			// If item greater, ignore left half, consider only right half
			if (arr[mid] < item)
				left = mid + 1;

			// If item is smaller, ignore right half, consider only left half
			else
				right = mid - 1;
		}

		// if we are able to reach here
		// means item wasn't present
		return -1;
	}

	public static void main(String args[]) {

		int[] array = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int item = 70;
		int size = array.length;

		int position = binarySearch(array, 0, size - 1, item);

		if (position == -1)
			System.out.println("Element not found");
		else
			System.out.println("The value " + item + " found at position: " + position);

	}
}

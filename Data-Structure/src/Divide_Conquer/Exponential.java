package Divide_Conquer;

public class Exponential {
	// Binary search algorithm to return the position of key `x` in
	// subarray A[left…right]
	private static int binarySearch(int[] A, int left, int right, int x) {
		// base condition (search space is exhausted)
		if (left > right) {
			return -1;
		}

		// find the mid-value in the search space and
		// compares it with the key

		int mid = (left + right) / 2;

		// overflow can happen. Use
		// int mid = left + (right - left) / 2;

		// base condition (a key is found)
		if (x == A[mid]) {
			return mid;
		}

		// discard all elements in the right search space,
		// including the middle element
		else if (x < A[mid]) {
			return binarySearch(A, left, mid - 1, x);
		}

		// discard all elements in the left search space,
		// including the middle element
		else {
			return binarySearch(A, mid + 1, right, x);
		}
	}

	// Returns the position of key `x` in a given array `A` of length `n`
	public static int exponentialSearch(int[] A, int x) {
		// base case
		if (A == null || A.length == 0) {
			return -1;
		}

		int bound = 1;

		// find the range in which key `x` would reside
		while (bound < A.length && A[bound] < x) {
			bound *= 2; // calculate the next power of 2
		}

		// call binary search on A[bound/2 … min(bound, n-1)]
		return binarySearch(A, bound / 2, Integer.min(bound, A.length - 1), x);
	}

	// Exponential search algorithm
	public static void main(String[] args) {
		int[] A = { 2, 5, 6, 8, 9, 10 };
		int key = 9;

		int index = exponentialSearch(A, key);

		if (index != -1) {
			System.out.println("Element found at index " + index);
		} else {
			System.out.println("Element not found in the array");
		}
	}
}

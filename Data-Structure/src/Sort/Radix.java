package Sort;

//Radix sort Java implementation 
import java.io.*;
import java.util.*;

public class Radix {

	/* Main Method to check for above function */
	public static void main(String[] args) {
		int a[] = { 17, 45, 75, 90, 82, 24, 12, 60 };
		int len = a.length;
		radixsort(a, len);
		print(a, len);
	}

// A utility function to get maximum value in a[] 
	static int getMax(int a[], int len) {
		int mx = a[0];
		for (int i = 1; i < len; i++)
			if (a[i] > mx)
				mx = a[i];
		return mx;
	}

// A function to do counting sort of arr[] according to 
// the digit represented by exp. 
	static void countSort(int a[], int len, int exp) {
		int output[] = new int[len]; // output array
		int i;
		int count[] = new int[10];
		Arrays.fill(count, 0);

// Store count of occurrences in count[] 
		for (i = 0; i < len; i++)
			count[(a[i] / exp) % 10]++;

// Change count[i] so that count[i] now contains 
// actual position of this digit in output[] 
		for (i = 1; i < 10; i++)
			count[i] += count[i - 1];

// Build the output array 
		for (i = len - 1; i >= 0; i--) {
			output[count[(a[i] / exp) % 10] - 1] = a[i];
			count[(a[i] / exp) % 10]--;
		}

// Copy the output array to arr[], so that arr[] now 
// contains sorted numbers according to curent digit 
		for (i = 0; i < len; i++)
			a[i] = output[i];
	}

	
	
	
	
	
	
	
	
	
// The main function to that sorts arr[] of size n using 
// Radix Sort 
	static void radixsort(int a[], int len) {
// Find the maximum number to know number of digits 
		int m = getMax(a, len);

// Do counting sort for every digit. Note that instead 
// of passing digit number, exp is passed. exp is 10^i 
// where i is current digit number 
		for (int exp = 1; m / exp > 0; exp *= 10)
			countSort(a, len, exp);
	}

// A utility function to print an array 
	static void print(int a[], int len) {
		for (int i = 0; i < len; i++)
			System.out.print(a[i] + " ");
	}
}

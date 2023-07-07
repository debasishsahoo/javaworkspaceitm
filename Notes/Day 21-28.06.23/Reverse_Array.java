import java.util.*;

public class Reverse_Array {

  public static void main(String[] args) {
    // Given input array
    int[] inputArray = { 2, 4, 6, 8, 10 };
    // Print array before reverse
    System.out.println(
      "Array without reverse : " + Arrays.toString(inputArray)
    );
    // Calling method to swap elements
    reverse(inputArray);
  }

  public static void reverse(int[] inputArray) {
    for (
      int left = 0, right = inputArray.length - 1;
      left < right;
      left++, right--
    ) {
      // swap the values at the left and right indices
      int temp = inputArray[left];
      inputArray[left] = inputArray[right];
      inputArray[right] = temp;
    }
    // Printing the Array after reverse
    System.out.print("Reverse Array :");
    for (int i : inputArray) {
      System.out.println(" " + i);
    }
  }
}

import java.util.*;

public class Reverse_String {

  public static void main(String[] args) {
    // Given input array
    String[] inputArray = { "India", "UK", "Pakistan", "Australia" };
    // Print array before reverse
    System.out.println("Initial String array : " + Arrays.toString(inputArray));
    // Calling method to swap elements
    reverse(inputArray);
  }

  public static void reverse(String[] inputArray) {
    for (
      int left = 0, right = inputArray.length - 1;
      left < right;
      left++, right--
    ) {
      // swap the values at the left and right indices
      String temp = inputArray[left];
      inputArray[left] = inputArray[right];
      inputArray[right] = temp;
    }
    // Printing the Array after reverse
    System.out.print("Reverse Array : " + Arrays.toString(inputArray));
  }
}

import java.util.*;

public class Array_Sort_Sum {

  public static void findPairs(int arr[], int n, int targetSum) {
    Arrays.sort(arr);

    int left = 0, right = n - 1;

    System.out.println("The pairs present are : ");

    while (left < right) {
      int currSum = arr[left] + arr[right];

      if (currSum == targetSum) {
        System.out.println("(" + arr[left] + ", " + arr[right] + ") ");
        left++;
        right--;
      } else if (currSum < targetSum) {
        left++;
      } else {
        right--;
      }
    }
  }

  public static void main(String args[]) {
    int arr[] = { 5, 8, 1, 4, 6, 3, 2, 7 };
    int n = arr.length;
    int targetSum = 10;
    findPairs(arr, n, targetSum);
  }
}

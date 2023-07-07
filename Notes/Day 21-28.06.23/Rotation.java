import java.util.*;

public class Rotation {

  void rightRotate(int[] arr, int n) {
    int temp;
    for (int i = 1; i <= n; i++) {
      temp = arr[arr.length - 1];
      for (int j = arr.length - 1; j > 0; j--) {
        arr[j] = arr[j - 1];
      }
      arr[0] = temp;
    }
    System.out.println(
      "Input Array After Right Rotation By " + n + " Positions :"
    );
    System.out.println(Arrays.toString(arr));
  }

  void leftRotate(int[] arr, int n) {
    int temp;
    for (int i = 0; i < n; i++) {
      temp = arr[0];
      for (int j = 0; j < arr.length - 1; j++) {
        arr[j] = arr[j + 1];
      }
      arr[arr.length - 1] = temp;
    }
    System.out.println(
      "Input Array After Left Rotation By " + n + " Positions :"
    );
    System.out.println(Arrays.toString(arr));
  }

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      System.out.println("Enter the length of the array you wish to rotate: ");
      int l = s.nextInt();
      int arr1[] = new int[l];
      int arr2[] = new int[l];

      System.out.println("Enter the Elements");
      for (int i = 0; i < l; i++) {
        arr1[i] = s.nextInt();
        arr2[i] = arr1[i];
      }

      System.out.println("Enter the index of rotation");
      int r = s.nextInt();
      System.out.println("Input Array Before Rotation :");
      System.out.println(Arrays.toString(arr1));

      Rotation m = new Rotation();
      m.rightRotate(arr1, r);
      m.leftRotate(arr2, r);
    }
  }
}

public class Pair_Sum {

  static void p_sum(int a[], int size, int sum) {
    System.out.print("The pairs present are : ");
    //traverse through the array to find pairs
    for (int i = 0; i < size; i++) {
      for (int j = i + 1; j < size; j++) {
        if (a[i] + a[j] == sum) {
          System.out.println("(" + a[i] + ", " + a[j] + ") ");
        }
      }
    }
  }

  // Driver Code
  public static void main(String[] arg) {
    int a[] = { 5, 2, 3, 4, 1, 6, 7 };
    int size = a.length;
    int sum = 7;
    p_sum(a, size, sum);
  }
}

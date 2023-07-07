public class makeWaveform2 {

  public static void makeWF2(int n, int arr[]) {
    int temp;
    for (int i = 0; i < n; i += 2) {
      if (i > 0 && arr[i - 1] > arr[i]) {
        temp = arr[i];
        arr[i] = arr[i - 1];
        arr[i - 1] = temp;
      }
      if (i < n - 1 && arr[i] < arr[i + 1]) {
        temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
      }
    }

    System.out.println("Array in Waveform Pattern : ");
    for (int ele : arr) {
      System.out.println(ele + " ");
    }
  }

  public static void main(String args[]) {
    int arr[] = { 5, 8, 1, 4, 6, 3, 2, 7 };
    int n = arr.length;
    makeWF2(n, arr);
  }
}

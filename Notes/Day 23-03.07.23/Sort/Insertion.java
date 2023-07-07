package Sort;

public class Insertion {
    /*Function to sort array using insertion sort*/
    static void insertionSort(int arr[])
    {
        int len = arr.length; //calculating the length of the array
        for (int i = 1; i < len; i++) 
        { 
            int key = arr[i]; 
            int j = i - 1; 

            /* Shift elements of a[i-1 .... 0], that are greater 
            than key, to one position right of their 
            current position */ 
            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    /* A utility function to print array of size n*/
    static void printArray(int a[])
    {
        int len = a.length;
        for (int i = 0; i < len; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
    }
 // Main method
    public static void main(String args[])
    {
        int a[] = {11, 9, 7, 15, 6, 10, 5, 17};

        System.out.println("Array Before Insertion Sort: ");
        printArray(a);

        insertionSort(a);

        System.out.println("Array After Insertion Sort: ");
        printArray(a);
    }
    
    
}

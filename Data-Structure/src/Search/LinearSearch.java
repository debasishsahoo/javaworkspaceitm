package Search;

public class LinearSearch {
	private static void linearSearch(int[] arr, int item) {

        for(int i=0;i < arr.length;i++){
            if(arr[i] == item)
            {
                System.out.println(item + " Found at index : " + i);
                return;
            }
        }
        System.out.println("Not found");

    }

    public static void main(String args[]) {
        int[] arr = {12, 5, 18, 25, -3, 19};

        int item = 25;
        linearSearch(arr, item);
    }
}

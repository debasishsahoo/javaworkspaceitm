package problams;

public class Largest_Element {

	public static void main(String[] args) {
		 //Initializing an  array
	    int [] arr = new int [] {11, 22, 33, 99, 88, 77};
	    //This element will store the largest element of the array
	    //Initializing with the first element of the array
	    int largestElement = arr[0];
	    //Running the loop from 1st element till last element
	    for (int i = 0; i < arr.length; i++) {
	      //Compare each elements of array with largestElement
	      //If an element is greater, store the element into largestElement
	      if(arr[i] > largestElement)
	        largestElement = arr[i];
	    }
	    System.out.println("Largest element of given array: " + largestElement);

	}

}

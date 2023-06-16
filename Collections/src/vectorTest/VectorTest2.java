package vectorTest;
import java.util.Vector;
public class VectorTest2 {
public static void main(String[] args)
{
// Create an empty generic vector with an initial capacity of 10.
   Vector<String> v = new Vector<String>();

// Adding elements to vector.
    v.add("A");
    v.add("B");
    v.add("C");
    v.add("D");
    v.add("E");
  System.out.println("Elements: " +v);

// Call firstElement() method to get the first element using reference variable v.
// Since the return type of firstElement method is String.
// Therefore, we will store it using variable firstElement of data type String.
   String firstElement = v.firstElement();
   System.out.println("First Element: " +firstElement);

   String lastElement = v.lastElement();
   System.out.println("Last Element: " +lastElement);

   String element = v.elementAt(3);
   System.out.println("Element at position 3: " +element);

   boolean checkElement = v.contains("F"); // Return type of contains method is boolean.
   System.out.println("Element F: " +checkElement);

// Create an array object with an initial capacity of 5.
   String[] arr = new String[5];

// Copy collection of elements into an array str.
    v.copyInto(arr);
    System.out.println("Elements in an array arr");
    for(String str:arr)
    {
       System.out.println(str);
    }
// Call clone() method to create a clone of a vector.
   Object obj = v.clone(); // Return type of clone method is an Object.
   System.out.println("Clone of v: " +obj);
  }
}
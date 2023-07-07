package ArrayListTest;
import java.util.ArrayList;
public class ArrayListTest {
public static void main(String[] args)
{
 ArrayList al = new ArrayList();
  al.add("Apple");
  al.add("Orange");
  al.add("Banana");
  al.add("Gauva");
 System.out.println(al);

// Call get() method using object reference variable 'al' to get the specified element.
// Since return type of get() method is String, we will store it by using a fruitsName variable with data type String.
   String fruitsName = (String) al.get(2);
   System.out.println(fruitsName);

// Call size() method to get the number of elements present in the list.
// Since return type of size method is an integer, we will store it by using variable numberOfElements with data type integer.
   int numberOfElements = al.size();
   System.out.println(numberOfElements);

// Check apple element is present or not.
   boolean check = al.contains("Apple");
   System.out.println(check);
 }
}
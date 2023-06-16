package Enumeration;
import java.util.ArrayList;
public class IterateArrayList
{
public static void main(String[] args)
{
// Create object of ArrayList of type String. In the list, we can add only String type of elements.
   ArrayList<String> al = new ArrayList<String>();

// Call add() method to add the elements in the list using reference variable al.
   al.add("A"); // Adding element at index 0.
   al.add("B"); // Adding element at index 1.
   al.add("C"); // Adding element at index 2.
   al.add("D"); // Adding element at index 3.
   al.add("E"); // Adding element at index 4.

// Displaying original elements of the ArrayList.
   System.out.println(al); // It will display all elements of ArrayList at a time.

// Iterating ArrayList using for loop and call size() method to get the size of elements.
// Since the return type of size method is an integer.
// Therefore, we will store it using variable elementsize of type int.

   System.out.println("Using for loop");
   int elementsize = al.size();
   System.out.println("Size: " +elementsize);
   for(int i = 0; i < al.size(); i++)
   {
 // Call get() method to return elements on specified index after iterating.
    String getElement = al.get(i);
    System.out.println(getElement);
   }
   al.set(2, "G"); // It will replace current element at position 2 with element G.
   al.set(3, null); // adding null element at position 3.

// Iterating ArrayList using Enhance for loop.
   System.out.println("Using Enhance for loop");
   for(String element:al)
   {
      System.out.println(element);
    }
   }
 }
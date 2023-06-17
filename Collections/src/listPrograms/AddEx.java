package listPrograms;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class AddEx {
public static void main(String[] args)
{
// Create a List.
// Here, there is no use of generic. So, there is no type safety.
// We can add both integer and string elements.
   List al = new ArrayList();

// Adding elements using add() method with reference variable al.
   al.add(10); // It will go at position 0.
   al.add(20); // It will go at position 1.
   al.add(30); // It will go at position 2.
   al.add(40); // It will go at position 3.
   al.add("Shubh"); // At position 4.

// Adding an element to 4th position.
   al.add(4, 35);
// Adding an element to 5th position.
   al.add(5, 45);

   System.out.println("Elements after adding: " +al);
 }
}
package ArrayListTest;
import java.util.ArrayList;
public class RemoveEx
{
public static void main(String[] args)
{
// Create a generic Arraylist object of String type.
// This means the compiler will show an error if we try to put any other element than String.
   ArrayList<String> al = new ArrayList<String>(); // Default capacity is 10.

// Adding elements of String type.
   al.add("A");
   al.add("B");
   al.add("C");
   al.add("D");
   al.add(null);
   al.add("D");
   System.out.println(al);

// Call remove() method to remove element D.
// This statement removes the first occurrence of the specified element D at position 3, not from the position 5.
   al.remove("D");
   System.out.println(al);

   al.remove(3);
   System.out.println(al);

// Call set() method to replace an element D with a null element at position 3.
    al.set(3, null);
    System.out.println(al);
  }
}
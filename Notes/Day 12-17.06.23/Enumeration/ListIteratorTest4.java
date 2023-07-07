package Enumeration;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest4 {
public static void main(String[] args)
{
// Creating a list object.
  List<String> list = new ArrayList<>();
  list.add("A"); // Adding element A at index 0.
  list.add("B"); // Adding element B at index 1.
  list.add("C"); // Adding element C at index 2.

  System.out.println("List: " + list);
// Create the list iterator object by calling listIterator() method.
// | in the comments indicates the position of iterator.
   ListIterator<String> iterator = list.listIterator(); // |ABC
   System.out.println("List Iterator in Forward Direction:");
// Call hasNext() method to check elements are present in forward direction.
   boolean elementsPresent = iterator.hasNext(); // Return true.
   System.out.println(elementsPresent);

   int indexA = iterator.nextIndex();
   String elementA = iterator.next(); // A|BC
   System.out.println("IndexA = " +indexA +" "+ "Element: " +elementA);

   int indexB = iterator.nextIndex();
   String elementB = iterator.next(); // AB|C
   System.out.println("IndexB = " +indexB +" "+ "Element: " +elementB);

   int indexC = iterator.nextIndex();
   String elementC = iterator.next(); // ABC|
   System.out.println("IndexC = " +indexC +" "+ "Element: " +elementC);

  
   boolean elementsPresent2 = iterator.hasNext(); // Return false because the iterator is at the end of the collection.
   System.out.println(elementsPresent2);
   String element = iterator.next(); // It will throw NoSuchElementException because there is not next element.
 }
}
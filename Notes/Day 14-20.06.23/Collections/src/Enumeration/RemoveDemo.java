package Enumeration;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class RemoveDemo {
public static void main(String[] args)
{
 List<String> list = new ArrayList<>();
  list.add("A");
  list.add("B");
  list.add("C");
  list.add("D");
  System.out.println("List: "+list);

  ListIterator<String> listIterator = list.listIterator();
  System.out.println("Forward Direction Iteration:");

  while(listIterator.hasNext()) {
     System.out.println(listIterator.next());
  }
  listIterator.remove(); // Removes the last element returned by next method.
  System.out.println("New List: " +list);
 }
}
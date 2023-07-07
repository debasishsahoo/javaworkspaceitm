package Enumeration;
import java.util.ArrayList;
import java.util.Iterator;
public class AddingElementUsingIteration {
public static void main(String[] args)
{
 ArrayList<String> al = new ArrayList<String>();
  al.add("Lion");
  al.add("Tiger");
  al.add("Elephant");
  al.add("Bear");

 Iterator<String> itr = al.iterator();
 while(itr.hasNext())
 {
   System.out.println(itr.next());
// Adding element during iteration.
// Since the return type of add() method is boolean, we will store it using variable b with data type boolean.
   boolean b = al.add("Leopard"); // Compile time error. It will throw ConcurrentModificationException.
   System.out.println(b);
  }
 }
}
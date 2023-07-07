package Enumeration;
import java.util.ArrayList;
import java.util.Iterator;
public class RemoveTest {
public static void main(String[] args)
{
// Creating an ArrayList object of type String.
   ArrayList<String> al = new ArrayList<String>();
   al.add("Apple");
   al.add("Mango");
   al.add("Banana");
   al.add("Guava");
   al.add("Pineapple");
   System.out.println(al); // It will print all elements at a time.

   System.out.println("Iteration using iterator concept.");
// Create an object of Iterator by calling iterator() method using reference variable al.
// At the beginning, itr(cursor) will point to index just before the first element in al.
   Iterator<String> itr = al.iterator();

// Checking the next element availability using reference variable itr.
   while(itr.hasNext())
   {
// Moving cursor to next element using reference variable itr.
     String str = itr.next();
     System.out.println(str);

// Removing the pineapple element.
   if(str.equals("Pineapple"))
   {
     itr.remove();
     System.out.println("After removing pineapple element");
     System.out.println(al);
    }
   }
 }
}
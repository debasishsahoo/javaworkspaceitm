package LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
public class IteratingLinkedHashSet {
public static void main(String[] args)
{
  LinkedHashSet<String> lhset = new LinkedHashSet<>();
  lhset.add("New York");
  lhset.add("Dhanbad");
  lhset.add("Sydney");
  lhset.add("Cape Town");
  lhset.add("London");

// Iterating elements of LinkedHashSet using iterator() method.
   System.out.println("Iteration using iterator");
   Iterator<String> itr = lhset.iterator();
   while(itr.hasNext())
   {
      System.out.println(itr.next());
   }
   System.out.println();

// Iterating elements of LinkedHashSet using enhanced for loop
   System.out.println("Iteration using enhanced for loop");
   for (String s : lhset)
     System.out.print(s + " ");
     System.out.println();
  }
}
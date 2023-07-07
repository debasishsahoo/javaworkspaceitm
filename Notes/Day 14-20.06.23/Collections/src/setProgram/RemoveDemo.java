package setProgram;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class RemoveDemo {
public static void main(String[] args)
{
  Set<String> set= new HashSet<>();
  set.add("Banana");
  set.add("Orange");
  set.add("Apple");
  set.add("Mango");

  Iterator<String> itr = set.iterator();
  while(itr.hasNext())
  {
    Object str = itr.next();
    System.out.println(str);

 // Removing Mango element.
    if(str.equals("Mango"))
    {
      itr.remove();
    }
   }
  System.out.println(set);
 }
}
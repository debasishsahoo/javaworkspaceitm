package setProgram;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class IterateSetEx {
public static void main(String[] args)
{
// Create a generic set object of type String.
   Set<String> s = new HashSet<String>(); // s.size() is 0.
   int size = s.size();
   System.out.println("Size before adding elements: " +size);

// Adding elements to set.
   s.add("Orange"); // s.size() is 1.
   s.add("Red"); // s.size() is 2.
   s.add("Blue"); // s.size() is 3.
   s.add("Yellow"); // s.size() is 4.
   s.add("Green"); // s.size() is 5.

// Displaying elements of set.
   System.out.println("Elements in set");
   System.out.println(s);

// Iterating set in the forward direction.
// Creating an Iterator object using iterator() method.
   Iterator<String> itr = s.iterator();
   System.out.println("Iteration using Iterator method");
   while(itr.hasNext())
   {
     Object str = itr.next();
     System.out.println(str);
   }
 }
}
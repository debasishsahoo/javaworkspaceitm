package setProgram;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class SetExample1
{
public static void main(String[] args)
{
	
	
// Create a generic set object of type String.
   Set<String> s = new HashSet<String>();
// Find out the size of set using set() method.
   int size = s.size();
   System.out.println("Size before adding elements: " +size);
   
// Adding elements to set.
   s.add("Orange"); // s.size()is 1.
   s.add("Red"); // s.size() is 2.
   s.add("Blue"); // s.size() is 3.
   s.add("Yellow"); // s.size() is 4.
   s.add("Green"); // Now s.size() is 5.
// Add duplicate elements in the set. These elements will be ignored by set due to not taking duplicate elements.
   s.add("Red"); // s.size() is still 5 because we cannot add duplicate element.
   s.add("Blue"); // s.size() is still 5 because we cannot add duplicate element.
   System.out.println("Unordered Set Elements");
   System.out.println(s);

   
   
// Check 'Black' element is present in the above set or not.
   if(s.equals("Black"))
   {
     System.out.println("Black element is not present in set.");
   }
   else
   {
     s.add("Black");
     System.out.println("Black is added successfully.");
     System.out.println("Set elements after adding black element");
     System.out.println(s);
   }
// Create another set object to add collection of elements to the above set.
   Set<String> s2 = new LinkedHashSet<String>();
    s2.add("White");
    s2.add("Brown");
    s2.add("Red"); // Duplicate element.

// Call addAll() method to add all the elements of the given collection.
   s.addAll(s2);
   System.out.println("Set elements after adding elements from given collection");
   System.out.println(s);
 }
}
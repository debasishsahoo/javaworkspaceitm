package setProgram;
import java.util.HashSet;
import java.util.Set;
public class IterateSetEx2 {
public static void main(String[] args)
{
// Create Set object of type Integer.
   Set<Integer> s = new HashSet<Integer>();
// Adding even numbers between 10 to 30 as elements.
   for(int i = 10; i <= 30; i++)
   {
     if(i % 2 == 0)
     {
       s.add(i);
     }
   }
   System.out.println("Even numbers between 10 to 30");
   System.out.println(s);
   System.out.println("Iteration Using Enchanced For Loop");

// Applying enhanced for loop to iterate over set.
   for(Integer it:s)
   {
     System.out.println(it);
   }
 }
}
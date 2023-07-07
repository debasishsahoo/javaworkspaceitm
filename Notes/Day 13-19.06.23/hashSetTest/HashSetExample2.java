package hashSetTest;
import java.util.ArrayList;
import java.util.HashSet;
public class HashSetExample2 {
public static void main(String[] args)
{
// Create an ArrayList object.
   ArrayList<String> al = new ArrayList<String>();
    al.add("Monday");
    al.add("Tuesday");
    al.add("Wednesday");
    al.add("Thursday");
    al.add("Friday");

// Adding duplicate elements.
    al.add("Monday");
    al.add("Friday");
    System.out.println("Original elements order: ");
    System.out.println(al);

// Create HashSet object.
   HashSet<String> hset = new HashSet<String>();

// Call addAll() method for adding all elements from existing collection to HashSet.
   hset.addAll(al);
   System.out.println("Unordered HashSet elements without duplicate elements: ");
   System.out.println(hset);
  }
}
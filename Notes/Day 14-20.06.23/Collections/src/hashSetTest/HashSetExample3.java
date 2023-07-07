package hashSetTest;
import java.util.HashSet;
public class HashSetExample3 {
public static void main(String[] args)
{
// Creating a hash set object of type integer.
   HashSet<Integer> hset = new HashSet<Integer>();

// Adding elements to hash set.
   hset.add(5);
   hset.add(10);
   hset.add(15);
   hset.add(20);

// Displaying the hash set elements.
   System.out.println("Initial list of elements");
   System.out.println(hset);

// Removing a specific element from HashSet.
   hset.remove(10);
   System.out.println("List of elements after removing 10");
   System.out.println(hset);
   
// Creating another HashSet object of type integer and adding elements.
   HashSet<Integer> hset2 = new HashSet<Integer>();
   hset2.add(10);
   hset2.add(25);
   hset2.add(15);
// Adding elements of hset2 into hset.
   hset.addAll(hset2);
   System.out.println("List of elements after adding elements from existing collection");
   System.out.println(hset);

   
   
   
   
   
// Removing all new elements from HashSet.
	/*
	 * hset.removeAll(hset2);
	 * System.out.println("List of elements after removing elements from hset2");
	 * System.out.println(hset);
	 */

// Removing all elements available in HashSet.
   hset2.clear();
   System.out.println("After invoking clear() method: "+hset);
  }












}
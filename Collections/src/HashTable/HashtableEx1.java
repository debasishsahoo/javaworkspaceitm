package HashTable;

import java.util.Hashtable;
public class HashtableEx1 {	
public static void main(String[] args) 
{
// Create a Hashtable object.	
   Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
  
// Checking hashtable is empty or not.
   boolean isEmpty = ht.isEmpty();
   System.out.println("Is hash table empty: " +isEmpty);

// Adding entries using put() method in hash table.
   ht.put(1, "One"); // ht.size() is 1.
   ht.put(2, "Two"); // ht.size() is 2.
   ht.put(3, "Three"); // ht.size() is 3.
   ht.put(4, "Four"); // ht.size() is 4.
   ht.put(5, "Five"); // ht.size() is 5.
   ht.put(6, "Six"); // ht.size() is 6.
 
   System.out.println("Displaying entries in hash table: " +ht);
   int size = ht.size();
   System.out.println("Size of hash table: " +size);

// Removing last entry.
   String removeE = ht.remove(6);
   System.out.println("Removed entry: " +removeE);
   System.out.println("Updated entries in hash table: " +ht);
  
// Getting the value of 4.
   String getValue = ht.get(4);
   
   System.out.println("Getting the value of 4: " +getValue);
   System.out.println("Getting the value of 2: " +ht.get(2));
  }
}
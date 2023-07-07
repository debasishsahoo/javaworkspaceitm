package Map;

import java.util.HashMap;
import java.util.Map;
public class IterationTest3 {
public static void main(String[] args) 
{	
  Map<Integer, String> map = new HashMap<>();
 
   map.put(101, " John");
   map.put(202, " Ricky");
   map.put(303, " Deep");
   map.put(404, " Mark");
   map.put(505, " Maya");
     
// Iterating over keys of a map using keySet() method. 
   for (Integer rollNo : map.keySet()) 
   System.out.println("Roll No: " + rollNo);   
   System.out.println();   
	 
// Iterating over values of a map using values() method.  
   for (String name : map.values()) 
   System.out.println("Name: " + name); 
   
   map.forEach((r,n) -> System.out.println("Roll: "+ r + ", Name: " + n));
   
   
   
   
   
 }
}


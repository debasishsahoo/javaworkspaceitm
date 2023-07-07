package Hashing;
import java.util.*;   
import java.util.concurrent.*; 
public class Concurrenthashmap {
	public static void main(String[] args)   
    {   // creating ConcurrentHashMap
        ConcurrentHashMap<String, String>  caps = new ConcurrentHashMap<String,  String>();   
        // putting data in it
        caps.put("India", "Virat");   
        caps.put("Australia", "Commins");   
        caps.put("EngLand", "Root");   
          
		System.out.println(" caps are: " +caps);   
  
        System.out.println("is Virat  present? ::  "  
                           + caps.containsValue("Virat"));   
   
    }   
}

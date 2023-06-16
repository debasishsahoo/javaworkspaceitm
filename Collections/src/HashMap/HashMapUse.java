package HashMap;

import java.util.HashMap;
public class HashMapUse {
public static void main(String[] args) 
{	
  HashMap<String, Long> hmap = new HashMap<>();
   
  hmap.put("John", 9431676282L);
  hmap.put("Deep", 8292736478L);
  hmap.put("Shubh", 8123543268L);
  hmap.put("Mark", 9876789142L);
  hmap.put("Ricky", 8768976872L);

// Retrieve number with its key by calling get() method.
   Long number = hmap.get("Deep");
   System.out.println("Deep's phone number: " +number);
   
   Long number2 = hmap.getOrDefault("Steave", -1L);
   System.out.println("Alex's phone number: " +number2);
   }
}

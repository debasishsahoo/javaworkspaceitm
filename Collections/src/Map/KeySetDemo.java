package Map;

import java.util.HashMap;
import java.util.Map;
public class KeySetDemo {
public static void main(String[] args)
{
  Map<String, String> map = new HashMap<>();

   map.put("India", " Delhi");
   map.put("USA", " Washington, D.C.");
   map.put("Australia", " Canberra");
   map.put("New zealand", " Wellington");
   map.put("Switzerland", " Bern");

// Iteration over map using forEach() method.
   map.forEach((k,v) -> System.out.println("Country: "+ k + ", Capital: " + v));
 }
}
package LinkedHashMap;

import java.util.LinkedHashMap;
public class IteratingLinkedHashMap2 {
public static void main(String[] args) 
{	
  LinkedHashMap<Character, String> lhmap = new LinkedHashMap<>(); 
  lhmap.put('R', "Red");
  lhmap.put('G', "Green");
  lhmap.put('B', "Brown");
  lhmap.put('O', "Orange");
  lhmap.put('P', "Pink");

  System.out.println("Iterating Entries of LinkedHashMap");

// Iteration over map using forEach() method.   
   lhmap.forEach((k,v) -> System.out.println("Color code: "+ k + ", Color name: " + v)); 
 }
}
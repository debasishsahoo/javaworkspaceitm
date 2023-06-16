package TreeMap;

import java.util.TreeMap;
public class TreeMapEx4{
public static void main(String[] args) 
{
  TreeMap<Integer, String> tmap = new TreeMap<>();
  tmap.put(25, "John");
  tmap.put(22, "Shubh");
  tmap.put(30, "Ricky");
  tmap.put(35, "Peter");
  tmap.put(18, "Johnson");
 
  System.out.println("ceilingEntry: " +tmap.ceilingEntry(32)); 
  System.out.println("ceilingKey: " +tmap.ceilingKey(32));

  System.out.println("firstEntry: " +tmap.firstEntry());
  System.out.println("lastEntry: " +tmap.lastEntry());

  System.out.println("floorEntry: " +tmap.floorEntry(31));
  System.out.println("HigherEntry: " +tmap.higherEntry(30));
  System.out.println("LowerEntry: " +tmap.lowerEntry(30));

  System.out.println("pollFirstEntry: " +tmap.pollFirstEntry());
  System.out.println("pollLastEntry: " +tmap.pollLastEntry());
 }
}
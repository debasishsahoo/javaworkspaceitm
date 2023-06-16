package LinkedHashSet;

import java.util.ArrayList;
import java.util.LinkedHashSet;
public class RemovingDuplicate {
public static void main(String[] args)
{
  int[] num = {20, 30, 50, 30, 40, 80, 10, 10};
  ArrayList<Integer> ar = new ArrayList<Integer>();

// Adding numbers to the array list.
   for(int i = 0; i < num.length; i++)
   {
      ar.add(num[i]);
   }
  System.out.println("Original list: " +ar);
  LinkedHashSet<Integer> lhset = new LinkedHashSet<>(ar);
  System.out.println("New list after removing duplicate numbers: " +lhset);
 }
}
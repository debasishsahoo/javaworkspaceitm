package Enumeration;
import java.util.ArrayList;
import java.util.ListIterator;
public class AddRemoveTest {
public static void main(String[] args)
{
 ArrayList<String> al = new ArrayList<String>();
  al.add("One");
  al.add("Two");
  al.add("Three");
  al.add("Nine");
  al.add("Five");
  al.add("Seven");
 System.out.println(al);

 ListIterator<String> litr = al.listIterator();
 while(litr.hasNext())
 {
   String str = litr.next();
   if(str.equals("Nine"))
   {
     litr.remove();
     litr.add("Four");
     System.out.println(al);
   }
   else if(str.equals("Seven"))
   {
     litr.set("Six");
     System.out.println(al);
   }
  }
 }
}
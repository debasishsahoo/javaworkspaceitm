package listPrograms;
import java.util.ArrayList;
import java.util.List;
public class IndexOfEx {
public static void main(String[] args)
{
  List al = new ArrayList();
   al.add("AA");
   al.add("BB");
   al.add("CC");
   al.add("DD");
   al.add("EE");
   al.add("FF");

// To find the index of any particular element, use obj.indexOf(object o) method.
   System.out.println("Index of CC: " + al.indexOf("CC"));
   System.out.println("Index of FF: " + al.indexOf("FF"));
 }
}
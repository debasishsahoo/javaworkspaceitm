package listPrograms;
import java.util.ArrayList;
import java.util.List;
public class AddAllEx {
public static void main(String[] args)
{
// Create a list1 of only String type.
// This means that Compiler will give an error if we try to put any elements other than String type.
   List<String> al = new ArrayList<String>();

// Adding elements in the list1.
   al.add("Apple");
   al.add("Mango");
   al.add("Orange");
   al.add("Grapes");
   System.out.println("List1 contain: " +al);

// Create another list2 of String type.
   List<String> al2 = new ArrayList<String>();
    al2.add("11");
    al2.add("12");
    al2.add("13");
  System.out.println("List2 contain :-"+al2);

// Adding list2 in list1 at 2nd position (i.e. index = 2) using addAll() method.
   al.addAll(2, al2);
   System.out.println("List1 after adding List2 at 2nd position: " +al);
  }
}
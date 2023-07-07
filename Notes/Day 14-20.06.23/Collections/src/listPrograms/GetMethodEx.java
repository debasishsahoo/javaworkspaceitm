package listPrograms;
import java.util.ArrayList;
import java.util.List;
public class GetMethodEx {
public static void main(String[] args)
{
// Creating a list.
   List al = new ArrayList();

// Adding elements in the list using reference variable al.
   al.add("pen");
   al.add("pencil");
   al.add("ink");
   al.add("notebook");
   al.add("book");
   al.add("paper");

// Now call get(int index) method to get elements from specified indices and print them.
   System.out.println("First Element: " +al.get(0));
   System.out.println("Fourth Element: " +al.get(3));
  }
}
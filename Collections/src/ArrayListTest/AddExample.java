package ArrayListTest;
import java.util.ArrayList;
public class AddExample {
public static void main(String[] args)
{
// Create an object of the non-generic ArrayList.
   ArrayList al = new ArrayList(); // list 1 with default capacity 10.
    al.add("A");
    al.add("B");
    al.add(20);
    al.add("A");
    al.add(null);
   System.out.println(al);

// Create an object of another non-generic ArrayList.
   ArrayList al1 = new ArrayList(); // list 2.
    al1.add("a");
    al1.add("b");
    al1.add("c");

// Call addAll(Collection c) method using reference variable al to add all elements at the end of the list1.
    al.addAll(al1);
    System.out.println(al);

// Call addAll(int index, Collection c) method using reference al1 to add all elements at specified position 2.
    al1.addAll(2, al);
   System.out.println(al1);
  }
}
package ArrayListTest;
import java.util.ArrayList;
public class Test {
public static void main(String[] args)
{
 ArrayList<Integer> list = new ArrayList<Integer>();
  list.add(10);
  list.add(20);
  list.add(30);
  list.add(40);

  System.out.println(list);
  int pos = list.indexOf(30);
  System.out.println(pos);

  int lastPos = list.lastIndexOf(40);
  System.out.println(lastPos);
 }
}

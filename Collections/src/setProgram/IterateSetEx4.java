package setProgram;
import java.util.HashSet;
import java.util.Set;
public class IterateSetEx4 {
public static void main(String[] args)
{
  Set<String> set = new HashSet<>();
   set.add("apple");
   set.add("banana");
   set.add("orange");
   set.add("mango");
   set.add("grapes");

// Creating stream object by calling stream() method.
   set.stream().forEach(System.out::println);
 }
}

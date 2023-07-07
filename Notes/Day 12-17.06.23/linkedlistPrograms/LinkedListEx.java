package linkedlistPrograms;
import java.util.LinkedList;
public class LinkedListEx {
public static void main(String[] args)
{
// Create a LinkedList object of string type.
   LinkedList names = new LinkedList();

// Adding elements of only string type.
   names.add("John");
   names.add("Bob");
   names.add("Mark");
   names.add("John");

   System.out.println("Size of linked list: " +names.size());
   System.out.println("LinkedList insertion oreder: ");
   System.out.println(names);
   
   
   
   LinkedList cities = new LinkedList();

// Adding elements of only string type.
   cities.add("New York");
   cities.add("Dhanbad");
   cities.add("Sydney");
   cities.add("London");

// This statement removes "Sydney" from the LinkedList
   cities.remove(2);
   System.out.println(cities);

// This statement removes the first element ("New York") from the LinkedList.
   cities.removeFirst();

// This statement removes the last element ("London") from the LinkedList.
   cities.removeLast();
   System.out.println(cities);
   
   
   String city = (String) cities.get(1);
   System.out.println(city);
   
// This statement sets "Dhanbad" at specified position the LinkedList.
// It replaces "Moscow" with "Dhanbad" at index 1 in the LinkedList.
   cities.set(1, "Dhanbad");
   System.out.println(cities);

   
 }
}
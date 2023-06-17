package vectorTest;
import java.util.Vector;
public class VectorTest4
{
public static void main(String[] args)
{
	
	
   Vector<String> vec = new Vector<String>();
// Check vector is empty or not.
   boolean check = vec.isEmpty();
   System.out.println("Vector is empty: " +check);

   vec.add("Hydrogen");
   vec.add("Oxygen");
   vec.add("Boron");
   vec.add("Beryllium");
   vec.add("Boron");
   System.out.println("Elements: " +vec);

   boolean check1 = vec.isEmpty();
   System.out.println("Vector is empty: " +check1);
// Replace element oxygen with helium.
   vec.setElementAt("Helium", 1);
   vec.set(2, "Lithium");
   System.out.println("Elements after replacing: " +vec);

// Check size of the vector.
   int size = vec.size();
   System.out.println("Size of the vector: " +size);

// Setting new size of the vector.
   vec.setSize(8);
   System.out.println("Size of the vector after setting: " +vec.size());

// Check capacity of the vector.
   int capacity = vec.capacity();
   System.out.println("Capacity of the vector: " +capacity);

// Check the equality of element carbon.
   boolean equality = vec.equals("Carbon");
   System.out.println("Is Carbon present: " +equality);
  }
}
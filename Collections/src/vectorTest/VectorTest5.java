package vectorTest;
import java.util.Vector;
public class VectorTest5 {
public static void main(String[] args)
{
 Vector<Integer> v = new Vector<Integer>();
 for(int i = 0; i <= 10; i++)
 {
  if(i % 2 == 0)
  {
    v.add(i);
    System.out.println(i);
   }
 }
 int size = v.size();
 System.out.println("Size of the vector: " +size);
 int capacity = v.capacity();
 System.out.println("Capacity of the vector: " +capacity);

// Ensuring capacity.
   v.ensureCapacity(25);
// Checking capacity.
   System.out.println("Minimum capacity: " +v.capacity());

// Trim the capacity of the vector to the actual size.
   v.trimToSize();
   System.out.println("Minimum capacity after trimming: " +v.capacity());

// String representation of the vector.
   String str = v.toString();
   System.out.println("String equivalent of the vector: " +str);

// Get elements of vector as an array form.
    v.toArray();
    System.out.println(v);
   }
 }
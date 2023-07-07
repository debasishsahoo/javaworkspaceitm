package Stack;

import java.util.Stack;
public class StackEx4 {
public static void main(String[] args) 
{
  Stack<Integer> st = new Stack<>();
   
   st.push(25);
   st.push(30);
   st.push(35);
   st.push(40);
   st.push(45);
   
 System.out.println("Original elements of stack: " +st);
 System.out.println("Pop element: " +st.pop());
 System.out.println("Elements of stack after removing: " +st);

 System.out.println("Push element: " +st.push(50));
 System.out.println("Elements of stack after adding: " +st);
 }
}
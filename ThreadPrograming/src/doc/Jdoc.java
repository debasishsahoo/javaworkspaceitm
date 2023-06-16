package doc;



import java.io.*;

/**
* <h1>Find the Product of two numbers</h1>
* This program multiplies two integer values and outputs their product.
* <p>
*
* @author Debasish Sahoo
* @version 1.0
 * @since 2023-06-16
 */
 public class Jdoc {
   /**
   * This method is used to find the product of two integers. 
    This is a simple class method,
   * demonstrating the use of some Java doc Tags.
   * @param number1 This is the first parameter to the calcProduct method.
   * @param number2 This is the second parameter to the calcProduct method.
   * @return int It will return the product of both parameters in integer.
   */
   public int calcProduct (int number1, int number2) {
    return number1 * number2;
   }

   /**
   * This is the main method which makes use of the calcProduct method.
   * @param args Unused.
   * @return Nothing.
   * @throws IOException on input error.
   * @see IOException
   */

 public static void main(String args[]) throws IOException {
    Jdoc obj1 = new Jdoc();
    int product = obj1. calcProduct(7, 3);

    System.out.println("Product of 7 and 3 :" + product);
   } 
 }

public class OwnException extends Exception
{
// Declare parameterized constructor with String as a parameter.
OwnException(String str)
{
  super(str); // Call super exception class constructor.
 }
}
public class MultiCatchEx2 {
public static void main(String[] args)
{
try
{
// Create an object of user defined exception and throw it using throw clause.
   OwnException obj = new OwnException("Creating user defined exception");
   throw obj;

// or, throw new OwnException("Creating user defined exception");
 }
catch (OwnException ex)
{
  System.out.println("Caught a user defined exception");
  System.out.println(ex.getMessage());
 }
 }
}
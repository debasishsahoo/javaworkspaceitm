package Inheritance.has_a; 
import java.util.*;
public class Composition {

	public static void main (String[ ] args) 
    {  
        Book b2 = new Book ("Thinking Java", "Brua E"); 
        Book b3 = new Book ("Java: Complete Reference", "Herb S"); 
         
        List <Book> books = new ArrayList <Book>( );  
        books.add (b2); 
        books.add (b3); 
         
        Library library = new Library (books); 
         
        List<Book> bks = library.getTotalBooksInLibrary ( ); 
        for (Book bk : bks)
{   
      System.out.println ("Title : " + bk.title + " and "+" Author : " + bk.author); 
        } 
    } 

}

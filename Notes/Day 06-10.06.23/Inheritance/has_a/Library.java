package Inheritance.has_a;
import java.io.*; 
import java.util.*; 
public class Library {

	private final List <Book> books; 
    
    Library (List <Book> books) 
    { 
        this.books = books; 
    } 
    public List<Book> getTotalBooksInLibrary( )
{   
    return books; 
    } 

}

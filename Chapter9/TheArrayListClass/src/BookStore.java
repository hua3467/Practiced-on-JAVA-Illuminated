/**
 *
 * Anderson, Fransesch
 */
import java.util.ArrayList;

public class BookStore 
{
    private ArrayList<Book> library;
    
    /**
     *  default constructor
     *  instantiates ArrayList of Books;
     */
    public BookStore()
    {
        library = new ArrayList<Book>();
        library.add( new Book( "Intro to Java", "James", 56.99 ) );
        library.add( new Book( "Advanced Java", "Green", 65.99 ) );
        library.add( new Book( "Java Servlets", "James", 75.99 ) );
        library.add( new Book( "Intro to HTML", "Brown", 29.49 ) );
        library.add( new Book( "Intro to Flash", "James", 34.99 ) );
        library.trimToSize();
    }
    
    @Override
    public String toString()
    {
        String result ="";
        for( Book tempBook : library )
            result += tempBook.toString() + "\n";
        return result;
    }
    
    public ArrayList<Book> searchForTitle( String searchString )
    {
        ArrayList<Book> searchResult = new ArrayList<Book>();
        for( Book currentBook : library )
        {
            if( (currentBook.getTitle()).indexOf(searchString) != -1 )
                searchResult.add( currentBook );
        }
        searchResult.trimToSize();
        return searchResult;
    }
    
}

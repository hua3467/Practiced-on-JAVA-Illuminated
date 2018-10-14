/**
 *
 * Anderson, Fransesch
 */
public class Book 
{
    private String title;
    private String author;
    private double price;
    
    public Book()
    {
        title = "";
        author = "";
        price = 0.0;
    }
    
    /** overloaded constructor
     * @param newTitle
     * @param newAuthor
     * @param newPrice
     */
    public Book( String newTitle, String newAuthor, double newPrice )
    {
        title = newTitle;
        author = newAuthor;
        price = newPrice;
    }
    
    /**
     * 
     * @return 
     */
    public String getTitle()
    {
        return title;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    /**
     * toString
     * @return 
     */
    @Override
    public String toString()
    {
        return( "title: " + title + "\tauthor: " + author + "\tprice: " + price );
    }
    
}

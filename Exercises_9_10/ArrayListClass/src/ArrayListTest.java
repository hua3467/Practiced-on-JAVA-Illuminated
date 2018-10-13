
/**
 *
 * @author aaronyang
 */
public class ArrayListTest 
{
    public static void main( String[] args )
    {
    
    String[][] array1 = { {"one", "two"}, {"three", "four"}, {"five", "six"} };

    Concatenation list1 = new Concatenation(array1);
    
    System.out.println( list1.addAll() );
    }
}

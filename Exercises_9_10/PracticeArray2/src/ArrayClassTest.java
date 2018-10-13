/**
 *
 * @author aaronyang
 */
public class ArrayClassTest 
{
    public static void main( String [] args )
    {
        char[][] charArray = { { 'a', 'b'}, { 'c', 'd' }, { 'e', 'f' } };
        String[] stringArray = null;
        
        ArrayClass80 arrays = new ArrayClass80( charArray, stringArray );
        
        stringArray = arrays.newArray(charArray);
        
        for( int i = 0; i < stringArray.length; i++ )
        {
            System.out.println( stringArray[i] );
        }
    }
}

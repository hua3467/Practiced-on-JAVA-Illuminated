/**
 *
 * @author aaronyang
 */
public class ArrayClass80 
{
    private char[][] ArrayChar;
    private String[] ArrayString;
    
    public ArrayClass80( char[][] array1, String[] array2 )
    {
        ArrayChar = array1;
        ArrayString = array2;
    }
    
    public String[] newArray( char[][] array )
    {
        ArrayChar = array;
        ArrayString = new String[ array.length ];
        
        for ( int i = 0; i < array.length; i++ )
        {
            String group = "";
            for ( int j = 0; j < array[i].length; j++ )
            {
                group += ArrayChar[i][j];
            }
            ArrayString[i] = group;
            group = "";
        }
        return ArrayString;
    }
}

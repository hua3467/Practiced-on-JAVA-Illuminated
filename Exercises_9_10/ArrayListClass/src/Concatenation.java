
/**
 *
 * @author aaronyang
 */
public class Concatenation 
{
    
    private String[][] str1;


    
    public Concatenation( String[][] array )
    {
        this.str1 = array;
    }
    
    public String addAll()
    {
        String total = "";
        
        for ( int i = 0; i < str1.length; i++ )
        {
            for ( int j = 0; j < str1[i].length; j++ )
            {
                total += str1[i][j] + ",";
            }
        }
        
        return total;
    }
    
}

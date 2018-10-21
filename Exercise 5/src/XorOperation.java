/**
 *  66
 */

import java.util.Scanner;

public class XorOperation
{
    public static void main( String [] args )
    {
        Scanner scan = new Scanner( System.in );

        // Prompt and read the input from the user
        System.out.print( "Enter binary string( 0 and 1 ): ");

        String input = scan.next();

        // Set first character as result
        char result  = input.charAt(0);

        // for loop to perform XOR operation
        for ( int i = 0; i < input.length(); i++ )
        {
            result = input.charAt(i);

            for( int j = i + 1; j < input.length(); j++ )
            {
                if( result == input.charAt(j))
                    result = '0';
                else
                    result = '1';

                i = j;

            }
        }

        // Print the result
        if( result == '1' )
            System.out.println( "Result is --> TRUE");
        else
            System.out.println( "Result is --> FALSE");
    }
}

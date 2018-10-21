/**
 *      6.14.56
 */

import java.util.Scanner;

public class IsBinary
{
    public static void main( String [] args )
    {
        String binaryWord;
        int result = 0;

        Scanner input = new Scanner( System.in );

        System.out.print( "Please enter your binary word: ");
        binaryWord = input.next();


        for( int i = 0; i < binaryWord.length(); i++ )
        {
            while( binaryWord.charAt(i) !='1' && binaryWord.charAt(i) != '0') {
                System.out.println("Invalid input, please try again. ");
                System.out.print("Please enter your binary word: ");
                binaryWord = input.next();
            }

            result += Character.getNumericValue( binaryWord.charAt(i) );

        }

        if( result == 2 ) {
            System.out.println( binaryWord + " is accepted. ");
        }
        else
            System.out.println( binaryWord + " is rejected. ");

    }
}

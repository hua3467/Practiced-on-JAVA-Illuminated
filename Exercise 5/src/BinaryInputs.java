/**
 * 6.14.54
 */
import java.util.Scanner;

public class BinaryInputs
{
    public static void main( String [] args )
    {
        int count0 = 0;
        int count1 = 0;
        String binaryInput;

        Scanner input = new Scanner( System.in );

        System.out.print("Please enter a binary number (1 and 0) > ");
        binaryInput = input.next();

        for( int i = 0; i < binaryInput.length(); i++ )
        {
            if ( binaryInput.charAt(i) == '0' || binaryInput.charAt(i) == '1' )
            {
                if ( binaryInput.charAt(i) == '0')
                    count0++;
                else
                    count1++;
            }
            else
            {
                System.out.println("Invalid input! ");
                System.out.print("Please enter a number only contains 1 and 0 > ");
                binaryInput = input.next();
                count0 = 0;
                count1 = 0;
                i = 0;
            }

        }

        System.out.println( "Number of 1s: " + count1 );
        System.out.println( "Number of 0s: " + count0 );
    }
}

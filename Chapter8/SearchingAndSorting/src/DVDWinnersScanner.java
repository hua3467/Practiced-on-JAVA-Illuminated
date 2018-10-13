
import java.util.Scanner;

public class DVDWinnersScanner
{
    public static void main ( String [] args )
    {

        DVDWinners winningIDs = new DVDWinners();

        // Prompt for the member ID
        Scanner scan = new Scanner( System.in );
        System.out.print( "Enter the member's ID or 0 to stop > " );

        int searchID = scan.nextInt();

        while ( searchID != 0 )
        {
            // determine whether a member is a winner
            System.out.println( winningIDs.getPrize( searchID ));

            System.out.print( "Enter the member's ID or 0 to stop > " );

            searchID = scan.nextInt();
        }

        System.out.println( "\nThe winners were "
                + winningIDs.toString());
    }

}

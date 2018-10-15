/** 8.11.65
 *
 * @author aaronyang
 */
import java.util.Scanner;

public class TicTacToeClient 
{
    public static void main( String[] args )
    {

        TicTacToe game = new TicTacToe();
        int player = 1;
        int position;
        
        System.out.println( "Empty board: " + game.toString() + "\n" );
        
        Scanner scan = new Scanner( System.in );

        // prompt for plays, as ints, from the user
        int n = 1;
        for( int i = 0; i < 9; i++ )
        {

            System.out.print("Pleyer " + player + ": ");
            position = scan.nextInt();
            game.move(player, position);
            n = n * (-1);
            
            if ( game.isOwner(player))
            {
                System.out.println( "\n" + player + " wins!");
                i = 9;
            }
                    
            if ( n == 1 )
                player = 1;
            if ( n == -1 )
                player = 2;
    
        }
        
        System.out.println( "Final board: " + game.toString() );
    }
}

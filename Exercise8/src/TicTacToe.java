/** 8.11.65
 *
 * @author aaronyang
 */
public class TicTacToe 
{
    private int[] board;
    
    
    // default constructor
    public TicTacToe()
    {
        board = new int[9];
    }
    
    public int[] getElements()
    {
        return board;
    }
    
    // method that allows aplayer to make move;
    public void move( int playerInt, int position ) throws IllegalArgumentException
    { 
        if( board[position] == 0 
                && position >= 0 
                && position < 9)
            board[position] = playerInt;
        else
            throw new IllegalArgumentException( "invalid input" );
            
    }
    
    // check if a play is legal;
    public boolean isLegal()
    {
        return false;
    }
    
    // method that check if a player own the game
    public boolean isOwner( int player )
    {
 
            return ( (board[0] == board[1] && board[1] == board[2] &&  board[0] == player && board[1] == player  && board[2] == player)
                            || (board[3] == board[4] && board[4] == board[5] && board[3] == player && board[4] == player  && board[5] == player)
                            || (board[6] == board[7] && board[7] == board[8] && board[6] == player && board[7] == player  && board[8] == player)
                            || (board[0] == board[3] && board[3] == board[6] && board[0] == player && board[3] == player  && board[6] == player)
                            || (board[1] == board[4] && board[4] == board[7] && board[1] == player && board[4] == player  && board[7] == player)
                            || (board[2] == board[5] && board[5] == board[8] && board[2] == player && board[5] == player  && board[8] == player)
                            || (board[0] == board[4] && board[4] == board[8] && board[0] == player && board[4] == player  && board[8] == player)
                            || (board[2] == board[4] && board[4] == board[6] && board[2] == player && board[4] == player  && board[6] == player) );
    }
    
    public String toString()
    {
        String str = "";
        for( int i = 0; i < board.length; i++ )
        {
            str += board[i] + " ";
        }
        
        return str;
    }
    
}

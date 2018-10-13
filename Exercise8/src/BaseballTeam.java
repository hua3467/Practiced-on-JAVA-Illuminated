/**
 *
 * @author aaronyang
 */
public class BaseballTeam 
{
    private int playerNum;
    private int [] hits;
    private int [] bats;
    
    public BaseballTeam( int number )
    {
        playerNum = number;
        hits = new int[number];
        bats = new int[number];
    }
    
    public int getPlayerNum()
    {
        return playerNum;
    }
    
    public int[] getHits()
    {
        return hits;
    }
    
    public int[] getBats()
    {
        return bats;
    }
    
    public void setPlayerNum( int newPlayerNum)
    {
        playerNum = newPlayerNum;
    }
    
    public void setHits( int index, int newHits )
    {
        hits[index] = newHits;
    }
    
    public void setBats( int index, int newBats )
    {
        bats[index] = newBats;
    }
    
    @Override
    public String toString()
    {
        String showHits = "";
        String showBats = "";
        
        for( int i = 0; i < hits.length; i++ )
        {
            showHits += String.valueOf( hits[i] ) + ", " ;
            showBats += String.valueOf( bats[i] ) + ", ";
        }
        
        return ( "The number of player is " + playerNum +
                "\nThe array of hits is " + showHits + 
                "\nThe array of bats is " + showBats );
    }
}

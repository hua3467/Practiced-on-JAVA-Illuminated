
import java.util.Random;

public class DVDWinners
{
    private int [] winners;
    private String [] prizes = { "3 free rentals!", "2 free rentals!",
            "1 free rentals!", "free popcorn!", "a free box of candy!" };

    /*
    * Default constructor instantiates winners array and randomly generates winning member IDs.
    *
    *
    * */
    public DVDWinners()
    {
        winners = new int[prizes.length];
        fillWinners();
    }

    // Utility method generates winner member IDs and stores them in the winners array
    public void fillWinners()
    {
        Random rand = new Random();

        for ( int i = 0; i < prizes.length; i++ )
        {
            winners[i] = rand.nextInt(5000) + 1;
        }
    }

    // Calls indexOfWinner with the member number then translates return value into the prize won
    public String getPrize( int memberNumber )
    {
        int prizeIndex = indexOfWinner( memberNumber );
        if ( prizeIndex == -1 )
            return "Sorry, member is not a winner.";
        else
            return "You win " + prizes[prizeIndex];
    }

    // Performs sequential search of winners array
    private int indexOfWinner( int key )
    {
        for ( int i = 0; i < winners.length; i++ )
        {
            if ( winners[i] == key )
                return i;
        }

        return -1;
    }

    public String toString()
    {
        String returnValue = "";
        for ( int i = 0; i < winners.length; i++ )
        {
            returnValue += winners[i] + "\t";
        }

        return returnValue;
    }


}

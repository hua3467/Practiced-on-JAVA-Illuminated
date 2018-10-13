/**
 *
 * @author aaronyang
 */
public class BaseballTeamTest 
{
    public static void main( String [] args )
    {
        BaseballTeam team1 = new BaseballTeam(6);
        
        int [] hits1 = team1.getHits();
        int [] bats1 = team1.getBats();
        
        team1.setBats(0, 5);
        team1.setHits(0, 4);
        
        System.out.println( team1.toString() );
    
    }
}

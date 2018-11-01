public class TeamTest {
    public static void main( String [] args ){

        Team myTeam1 = new Team( "Bearcat" );
        Team myteam2 = new Team( "Bison");

        System.out.println(myTeam1.toString());
        System.out.println(myteam2.toString());
        System.out.println(myTeam1.equals(myteam2));
    }
}

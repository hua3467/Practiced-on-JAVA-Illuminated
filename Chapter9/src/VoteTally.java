public class VoteTally {
    public static void main( String [] args ){

        // votes are for 4 candidates in 6 districts.
        int [][] votes = { {150, 253, 125, 345 },
                            { 250, 750, 234, 721 },
                            { 234, 243, 143, 276 },
                            { 243, 600, 212, 101 },
                            { 555, 343, 297, 990 },
                            { 111, 426, 834, 101 } };

        String[] candidates = { "Smith", "Jones", "Berry", "Chase"};

        Tally tally = new Tally ( votes );

        int[][] voteCounts = tally.arrayTally();

        System.out.println("Total votes per candidate");

        for( int i = 0; i < candidates.length; i++ )
            System.out.print( candidates[i] + "\t" );
        System.out.println();

        for( int j = 0; j < voteCounts[0].length; j++ )
            System.out.print( voteCounts[0][j] + "\t" );
        System.out.println();

        System.out.println("\nTotal votes per district");
        for( int i = 0; i < voteCounts[1].length; i++ )
            System.out.print( ( i + 1 ) + "\t");
        System.out.println();
        for( int i = 0; i < voteCounts[1].length; i++ )
            System.out.print( voteCounts[1][i] + "\t");
        System.out.println();

    }
}

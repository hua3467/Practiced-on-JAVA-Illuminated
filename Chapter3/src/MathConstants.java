public class MathConstants {

//A demonstration of the Math class methods and constants:

    public static void main(String [] args){

        System.out.println("The value of e is " + Math.E);
        System.out.println("The value of pi is " + Math.PI);

        double d1 = Math.abs( 6.7 );
        System.out.println("\nThe absolute value of 6.7 is " + d1);

        double d2 = Math.abs( -6.7 );
        System.out.println("\nThe absolute value of -6.7 is " + d2);

//A demonstration of some Math class methods:

        double d3 = Math.log(5);
        double d4 = Math.sqrt(9);

        double fourCubed = Math.pow( 2, 3 );
        double bigNumber = Math.pow( 43.5, 3.4 );

        System.out.println("\nd3: " + d3 );
        System.out.println("\nd4: " + d4 );
        System.out.println("\nfourCubed: " + fourCubed );
        System.out.println("\nbigNumber: " + bigNumber );

// round:

        System.out.println(Math.round(23.4));
        System.out.println(Math.round(45.5));

        //Demonstration of min and max Math class methods

        int smaller = Math.min( 8, 2 );
        System.out.println("\nThe smaller of 8 and 2 is " + smaller);

        int larger = Math.max( 8, 2 );
        System.out.println("\nThe larger of 8 and 2 is " + larger);

        int a = 8, b = 5, c = 2;
        int temSmaller = Math.min( a, b );
        int smallest = Math.min( temSmaller, c );
        System.out.println( "The smallest of " + a + ", " + b + ", and" + c + " is " + smallest );

        double f = 5.7;
        long i = Math.round( f );
        System.out.println(i);
    }

}

import java.util.Scanner;

public class DataInput {

    public static void main ( String [] args ){

        Scanner scan = new Scanner( System.in );

        System.out.print( "Enter your first name > ");
        String firstName = scan.next();
        System.out.println( " Your name is " + firstName );

        System.out.print( "\nEnter your age as an integer > " );
        int age = scan.nextInt();
        System.out.println( "Your age is " + age );

        System.out.print( "\nPlease enter your GPA > ");
        double gpa = scan.nextDouble();
        System.out.println( "Your GPS is " + gpa );

        System.out.print ( "\nEnter your middle initial > " );
        String initialS = scan.next();
        char initial = initialS.charAt(0);
        System.out.println( "Your middle initial is " + initial );

    }

}

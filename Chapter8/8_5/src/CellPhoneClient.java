import java.text.DecimalFormat;

public class CellPhoneClient
{
    public static void main( String [] args )
    {
        double [] bills = new double [3];
        bills[0] = 24.60;
        bills[1] = 48.75;
        bills[2] = 62.50;

        // instantiate CellPhone object using default constructor
        CellPhone c1 = new CellPhone();

        // instantiate two identical CellPhone objects
        CellPhone c2 = new CellPhone( "555-555-5555", bills );
        CellPhone c3 = new CellPhone( "555-555-5555", bills );

        // print data from c1 to c2
        System.out.println( "c1 = " + c1.toString() );
        System.out.println( "c2 = " + c2.toString() );

        // find and print maximum bill
        DecimalFormat money = new DecimalFormat( "S##0.00" );
        System.out.println( "\nThe highest bill is "
                + money.format( c2.findMaximumBill( ) ) );

        // find and print total of all bills
        System.out.println( "\nThe total of all bills is "
                + money.format( c2.calcTotalBills( ) ) );

        System.out.println();

        // call equals method
        if ( c2.equals( c3 ))
            System.out.println( "c2 and c3 are equal" );
        else
            System.out.println( "c2 and c3 are not equal " );

        bills[2] = 100.00;
        System.out.println( "\nafter client changes original array\n"
                + "c2 = " + c2.toString() );

        double [ ] billsCopy = c2.getCellBills();

        billsCopy[1] = 50.00;

        System.out.println( "\nafter client changes returned array\n"
        + "c2 = " + c2.toString( ) );
    }
}

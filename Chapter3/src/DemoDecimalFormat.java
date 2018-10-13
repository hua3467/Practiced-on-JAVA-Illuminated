import java.text.DecimalFormat;

public class DemoDecimalFormat {

    public static void main( String [] args ) {

        //first, instantiate a DecimalFormat object specifying a pattern for currency
        DecimalFormat pricePattern = new DecimalFormat("$0.00");

        double price1 = 78.66666666;
        double price2 = 34.5;
        double price3 = .3333333;
        int price4 = 3;
        double price5 = 10.23;

        System.out.println( "Price 1 is: " + pricePattern.format(price1) );
        System.out.println( "\nPrice 2 is: " + pricePattern.format(price2) );
        System.out.println( "\nPrice 3 is: " + pricePattern.format(price3) );
        System.out.println( "\nPrice 4 is: " + pricePattern.format(price4) );
        System.out.println( "\nPrice 5 is: " + pricePattern.format(price5) );

        DecimalFormat percentPattern = new DecimalFormat( "0.0#%" );

        double average1 = .98;
        System.out.println( "\naverage 1 is: " + percentPattern.format( average1 ) );

        double average2 = .98748;
        System.out.println( "\naverage 2 is: " + percentPattern.format( average2 ) );

        DecimalFormat timePattern = new DecimalFormat( "00" );

        int hours = 5, minutes = 12, seconds = 0;
        System.out.println( "\nThe time is: "
                       + timePattern.format( hours ) + ":"
                       + timePattern.format( minutes ) + ":"
                       + timePattern.format( seconds ) );

        DecimalFormat bigNumber = new DecimalFormat( "#,###" );

        int millions = 1234567;
        System.out.println( "\nmillions is: " + bigNumber.format( millions ));

    }

}

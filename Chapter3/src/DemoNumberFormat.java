import java.text.NumberFormat;

public class DemoNumberFormat {

    public static void main( String [] args ){

        double winningPercentage = .675;
        double price = 78.9;

        NumberFormat percentFormat = NumberFormat.getPercentInstance();

        System.out.print( "The winning percentage is " );
        System.out.println( percentFormat.format(winningPercentage) );

        NumberFormat priceFormat = NumberFormat.getCurrencyInstance();

        System.out.println( "\nthe price is: " + priceFormat.format(price) );

    }

}

public class TemperatureConversion {

    public static void main(String [] args){

        double fahrenheit = 20;
        double celsius = ( (double) 5 / 9 ) * ( fahrenheit - 32 );

        System.out.println( fahrenheit + " F = " + celsius + " C ");

        System.out.println( celsius + " C = " + (( 9 * celsius ) / 5 + 32) );

    }

}

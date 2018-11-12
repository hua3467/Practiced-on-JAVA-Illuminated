/* Example 9.2  Working with a Two-Dimensional Array of Objects
    Anderson
 */
public class TwoDimAutoArray {
    public static void main( String [] args ){

        // instantiate several Auto object references
        Auto sendan1 = new Auto( "BMW", 0, 0.0 );
        Auto sendan2 = new Auto( "BMW", 100, 15.0 );
        Auto sendan3 = new Auto( "Toyota", 0, 0.0 );
        Auto sportsCar = new Auto( "Ferrari", 0, 0.0 );
        Auto rv1 = new Auto( "Jeep", 0, 0.0 );
        Auto rv2 = new Auto( "Ford", 0, 0.0 );

        // declare and initialize two dimensional array of Autos
        Auto [][] cars = {
                { sendan1, sendan2, sendan3 },
                { sportsCar, new Auto() },
                { rv1, rv2 } };

        Auto retrievedCar = cars[1][0];
        // retrievedCar gets the sportsCar object reference

        System.out.println( "car[1][0]'s description is: \n" + retrievedCar );

    }
}

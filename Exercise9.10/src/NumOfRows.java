/**
 * 9.10.6.68
 */
public class NumOfRows {

    public static void main( String [] args ){

        double[][] myArray = { {23.1, 45.3, 23.5, 98.23 },
                {23.1, 45.3, 23.5, 98.23 },
                {23.1, 45.3, 23.5, 98.23 },
                {23.1, 45.3, 23.5, 98.23 },
                {23.1, 45.3, 23.5, 98.23 }};

        NumOfRows count = new NumOfRows(myArray);

        System.out.println(count.countRows());
    }

    private double [][] array;

    public NumOfRows( double [][] newArray ){

        array = new double[newArray.length][];      // create a new two-dimensional array and sign newArray.length to its row.

        for( int i = 0; i < newArray.length; i++ ){
            array[i] = new double[ newArray[i].length ];    // assign the length of each column of newArray to array.
        }

        for( int i = 0; i < newArray.length; i++ ){
            for( int j = 0; j < newArray[i].length; j++ ){
                array[i][j] = newArray[i][j];  // assign every value of newArray to array.
            }
        }
    }

    public int countRows(){
        return array.length;
    }
}

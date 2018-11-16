/**
 * 9.10.6.69
 * 9.10.6.72
 */

public class NumOfElements {

    public static void main(String[] args) {

        float[][] myArray = {{23.1f, 45.3f, 23.5f, 98.23f},
                {23.1f, 45.3f, 23.5f, 98.23f},
                {23.1f, 45.3f, 23.5f, 98.23f},
                {23.1f, 45.3f, 23.5f, 98.23f},
                {23.1f, 45.3f, 23.5f, 98.23f} };

        NumOfElements elements = new NumOfElements(myArray);

        System.out.println( "All the elements: " + elements.getElements());

        System.out.println( "Sum of all the elements: " + sumElements( myArray ) );

    }

    private float [][] array;

    public NumOfElements( float[][] newArray ){
        array = new float[newArray.length][];           // set the length of the row.

        for( int i = 0; i < newArray.length; i++ ){
            array[i] = new float[newArray[i].length];   // set the length of column of each row.
        }

        for( int i = 0; i < newArray.length; i++ ){
            for( int j = 0; j < newArray[i].length; j++ ){
                array[i][j] = newArray[i][j];
            }
        }
    }

    public String getElements(){
        String str = "";

        for( int i = 0; i < array.length; i++ ){
            for( int j = 0; j < array[i].length; j++ ){
                str += array[i][j] + "  ";
            }
        }

        return str;

    }

    public static float sumElements( float[][] array ){

        float sum = 0;

        for( int i = 0; i < array.length; i++ ){
            for( int j = 0; j < array[i].length; j++ ){
                sum += array[i][j];
            }
        }

        return sum;
    }


}

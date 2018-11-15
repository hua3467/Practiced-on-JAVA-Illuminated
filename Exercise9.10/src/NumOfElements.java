/**
 * 9.10.6.69
 */

public class NumOfElements {

    public static void main(String[] args) {

        float[][] myArray = {{23.1f, 45.3f, 23.5f, 98.23f},
                {23.1f, 45.3f, 23.5f, 98.23f},
                {23.1f, 45.3f, 23.5f, 98.23f},
                {23.1f, 45.3f, 23.5f, 98.23f},
                {23.1f, 45.3f, 23.5f, 98.23f} };

        NumOfElements elements = new NumOfElements(myArray);

        System.out.println(elements.getElements());

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


}

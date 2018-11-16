/**
 *  9.10.6.73
 *  9.10.6.74
 */

public class Set0and1 {
    public static void main( String [] args ){

        int [][] intArray = { { 12, 4, 42, 34, 32, 6, 39, 93 },
                { 12, 4, 42, 34, 32, 6, 39, 93 },
                { 12, 4, 42, 34, 32, 6, 39, 93 },
                { 12, 4, 42, 34, 32, 6, 39, 93 },
                { 12, 4, 42, 34, 32, 6, 39, 93 },
                { 12, 4, 42, 34, 32, 6, 39, 93 },
                { 12, 4, 42, 34, 32, 6, 39, 93 },
                { 12, 4, 42, 34, 32, 6, 39, 93 },
                { 12, 4, 42, 34, 32, 6, 39, 93 },
                { 12, 4, 42, 34, 32, 6, 39, 93 },
                { 12, 4, 42, 34, 32, 6, 39, 93 } };

        //setBinary( intArray );
        System.out.println( printArray(intArray));
        System.out.println("sumLastColumn: " + sumLastColumn(intArray));
    }

    public static void setBinary( int [][] array ){
        for( int i = 0; i < array.length; i++ ){
            for (int j = 0; j < array[i].length; j++){
                if( i % 2 == 0 )
                    array[i][j] = 0;
                else
                    array[i][j] = 1;
            }
        }
    }

    public static String printArray( int [][] array ){

        String str = "";

        for( int i = 0; i < array.length; i++ ) {
            for (int j = 0; j < array[i].length; j++) {
                if( j % 8 == 0 )
                    str += "\n";
                str += array[i][j] + "\t";
            }
        }
        return str;
    }

    public static int sumLastColumn( int[][] array ){

        int sum = 0;

        for( int i = 0; i < array.length; i++ )
            sum += array[i][array[i].length-1];

        return sum;
    }

}

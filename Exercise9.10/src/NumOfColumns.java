/**
 * 9.10.6.70
 */

public class NumOfColumns {
    public static void main( String [] args ){

        boolean [][] myArray = { {true, false, true, true, false },
                {true, false, true, true},
                {true, false, true, true, false, false},
                {true, false, true, true, false, false, true },
                {true, false, true, true, false, false},
                {true, true, false, false},
                {true, false, true, true, false, false} };

        NumOfColumns columns = new NumOfColumns(myArray);

        System.out.println(columns.countColumns());             // this doesn't print correctly. 
        System.out.println(columns.countColumnElements(6));
    }

    private boolean[][] array;

    public NumOfColumns( boolean [][] booleanArray ){
        array = new boolean[booleanArray.length][];

        for( int i = 0; i < booleanArray.length; i++ ){
            array[i] = new boolean[booleanArray[i].length];
        }

        for( int i = 0; i < booleanArray.length; i++ ){
            for( int j = 0; j < booleanArray[i].length; j++ ){
                array[i][j] = booleanArray[i][j];
            }
        }
    }

    public int countColumns(){
        return array[maxIndex()].length;
    }

    private int maxIndex(){
        int index = 0;

        for( int i = 0; i < array.length; i++ ){
            if( index < array[i].length )
                index = i;
        }
        return index;
    }

    public int countColumnElements( int n ){
        int count = 0;

        for( int i = 0; i < array.length; i++ ){
            if( array[i].length == n ){
                count++;
            }
        }

        return count;
    }
}

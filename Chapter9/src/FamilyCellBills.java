/*
    Example 9.1_Two-Dimensional Array of Cell Phone Bills
    Anderson
 */
public class FamilyCellBills {
    public static void main( String [] args ){
        // declare constants for the number of rows and columns
        final int NUMBER_OF_MONTHS = 3;
        final int NUMBER_OF_PERSONS = 4;

        // declare and instantiate the array;
        double [][] familyCellBills = new double[NUMBER_OF_MONTHS][NUMBER_OF_PERSONS];

        // assign values to array elements
        familyCellBills[0][0] = 45.24;  //row 0
        familyCellBills[0][1] = 54.67;
        familyCellBills[0][2] = 32.55;
        familyCellBills[0][3] = 25.61;

        familyCellBills[1][0] = 65.29;  //row 1
        familyCellBills[1][1] = 49.75;
        familyCellBills[1][2] = 32.08;
        familyCellBills[1][3] = 26.11;

        familyCellBills[2][0] = 75.24;  //row 2
        familyCellBills[2][1] = 54.53;
        familyCellBills[2][2] = 34.55;
        familyCellBills[2][3] = 28.16;

        System.out.println("The first month cell bill for the first family member is: "
                + familyCellBills[0][0]);

        System.out.println("The last monthly cell bill for the last family member is: "
                + familyCellBills[NUMBER_OF_MONTHS - 1][NUMBER_OF_PERSONS-1]);

        int numberRows = familyCellBills.length;
        System.out.println( "\nThe number of rows is " + numberRows );

        for( int i = 0; i < numberRows; i++ ){
            System.out.print("The number of columns in row " + i + " is ");
            System.out.println(familyCellBills[i].length);
        }


    }
}

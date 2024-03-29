/*  Example 9.5
    Processing One Column of a Two-Dimensional Array
    Anderson
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class MaxMemberBill {
    public static void main( String [] args ){

        // declare and initialize the array
        double[][] familyCellBills = {{45.24, 54.67, 32.55, 25.61},
                {65.29, 49.75, 32.08, 26.11},
                { 75.24, 54.53, 34.55, 28.16}};

        String [] familyMembers = { "Joe", "Jane", "Mike", "Sarah" };
        for( int i = 0; i < familyMembers.length; i++ ){
            System.out.println( "Family Member " + i + " : " + familyMembers[i] );
        }

        Scanner scan = new Scanner( System.in );
        int currentMember;
        do{
            System.out.print( "Enter a family member between 0 and 3> " );
            currentMember = scan.nextInt();
        } while ( currentMember < 0 || currentMember > 3 );

        double memberMaxBill = familyCellBills[0][currentMember];
        for ( int  i = 0; i < familyCellBills.length; i++ ){
            if( currentMember < familyCellBills[i].length){
                // update memberMaxBill if necessary
                if( familyCellBills[i][currentMember] > memberMaxBill )
                    memberMaxBill = familyCellBills[i][currentMember];
            }
        }

        NumberFormat priceFormat = NumberFormat.getCurrencyInstance();
        System.out.println("\nThe max cell bill for " + familyMembers[currentMember]
                + " is " + priceFormat.format(memberMaxBill));


    }
}

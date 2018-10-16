/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** Example 5.14
 *
 * @author aaronyang
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator 
{
    public static void main( String[] args )
    {
        double fp1, fp2;
        String operation;
        
        Scanner scan = new Scanner( System.in );
        
        // set up the output format of the result;
        DecimalFormat twoDecimals = new DecimalFormat( " #,###,###.##");
        
        // print a welcome message
        System.out.println("==========+-*/Calculator/*-+==========\n");
        
        // read the two operands
        System.out.print( "Enter the first operand: " );
        fp1 = scan.nextDouble();
        System.out.print( "Enter the second operand: " );
        fp2 = scan.nextDouble();
        
        // print a menu, then prompt for the operation
        System.out.println( "\nOperations are: "
                                + "\n\t ADD or + for addition" 
                                + "\n\t SUBTRACT or - for subtraction" 
                                + "\n\t MULTIPLY or * for multiplication" 
                                + "\n\t DIVIDE or / for division");
        
        System.out.print( "Enter your selection: ");
        operation = scan.next();
        
        // perform the operation and print the result
        switch ( operation )
        {
            case "ADD":
            case "+":
                System.out.println( "The sum is " + twoDecimals.format( fp1 + fp2 ) );
                break;
                
            case "SUBTRACT":
            case "-":
                System.out.println( "The subtraction is " + twoDecimals.format( fp1 - fp2 ) );
                break;
                
            case "MULTIPLY":
            case "*":
                System.out.println( "The multiplication is " + twoDecimals.format( fp1 * fp2 ));
                break;
                
            case "DIVIDE":
            case "/":
                System.out.println( "The division is " + twoDecimals.format( fp1 / fp2 ) );
                break;
                
            default:
                System.out.println( operation + " is not valid. ");
        }
    }
    
}

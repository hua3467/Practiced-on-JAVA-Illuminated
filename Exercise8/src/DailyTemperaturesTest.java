/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaronyang
 */
public class DailyTemperaturesTest 
{
    public static void main( String[] args )
    {
        int [] arrayTemp = { 23, 110, 31, 101, 32, 29, 43 };
        int [] arrayTemp1 = { 33, 43, 42, 39, 32, 43, 43 };
        
        DailyTemperatures temperatures = new DailyTemperatures( arrayTemp );
        
        String temp = "";
        for ( int i = 0; i <temperatures.aboveHundred().length; i++ )
        {
            temp += temperatures.aboveHundred()[i] + " ";
        }
        
        System.out.println("toString: [ " + temperatures.toString() + 
                "]\ntemperatures.qeuals(arrayTemp1): " + temperatures.qeuals(arrayTemp1) + 
                "\ntemperatures.bellowFreezing(): " + temperatures.bellowFreezing() + 
                "\nthe temperatures that are above 100 degrees: [ " + temp + 
                "]\ntemperatures.largestChange(): " + temperatures.largestChange() );
        
        temperatures.sort();
        System.out.println("After sort, the array is: [ " + temperatures.toString() + "]" );
    }
    
}

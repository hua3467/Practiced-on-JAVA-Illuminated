/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** 63
 *
 * @author aaronyang
 */


import java.util.Random;
import java.util.Arrays;

public class StudentsGrades 
{
    private int studentNumber;
    private int [] grades;
    
    public StudentsGrades( int number )
    {
        studentNumber = number;
        grades = new int[number];
        
        Random rand = new Random();
        for( int i = 0; i < number; i++ )
        {
            grades[i] = rand.nextInt(101);
        }
    }
    
    // Accessor
    public int getNumber()
    {
        return studentNumber;
    }
    
    public int getGrade( int i )
    {
        return grades[i];
    }
    
    public int getHightestGrade()
    {
        int max = 0;
        for( int i = 0; i < grades.length; i++ )
        {
            if( max < grades[i] )
                max = grades[i];
        }
        
        return max;
    }
    
    public int getAverageGrade()
    {
        int sum = 0;
        
        for( int i = 0; i < grades.length; i++ )
        {
            sum += grades[i];
        }
        
        return sum / grades.length;
    }
    
    public int getMidGrade()
    {
        int mid = 0;
        
        grades = sort();
        
        mid = grades[ grades.length / 2 ];

        return mid;
    }
    
    public int getMode()
    {
        int modeIndex = 0;
        int[] counter = new int[grades.length];
        
        for( int i = 0; i < grades.length; i++ )
        {
            for ( int j = 0; j < grades.length; j++ )
                if( grades[j] == grades[i] )
                    counter[j]++;
        }
        
        modeIndex = indexOfHighest( counter, grades.length );
        return modeIndex;
    }
    
    // Mutator
    public void setGrade( int i, int newGrade )
    {
        grades[i] = newGrade;
    }
    
    public int[] sort( )
    {
        int temp;
        int max;
        
        for ( int i = 0; i < grades.length - 1; i++ )
        {
           max = indexOfHighest( grades, grades.length - i );
           
           temp = grades[max];
           grades[max] = grades[grades.length - i - 1 ];
           grades[grades.length - i - 1 ] = temp;
           
        }
        return grades;
    }
    
    public boolean equals( int[] array )
    {
        if( array.length != grades.length )
            return false;
        
        if ( array.length == grades.length)
        {
            for ( int i = 0; i < grades.length; i++ )
            {
                    if( grades[i] != array[i] )
                        return false;
            }
        }
        return true;
    }
    
    
    public int indexOfHighest( int [] array, int size )
    {
        int index = 0;
        for ( int i = 1; i < size; i++ )
        {
            if( array[i] > array[index] )
                index = i;
        }
        return index;
    }
    
    @Override
    public String toString()
    { 
        return ( Arrays.toString(grades) );
    }
    
}

/** Exercise 8.11 64
 *
 * @author aaronyang
 */

public class DailyTemperatures 
{
    private final int DAYS = 7;
    private final int FREEZING = 32;
    private int[] temperatures = new int[DAYS];
    
    public DailyTemperatures( int[] array ) throws IllegalArgumentException
    {
        if ( array.length != DAYS )
        {
            throw new IllegalArgumentException("The number of temperatures must be 7.");
        }
        
        temperatures = array;
        
    }
    
    // Accessor methods
    
    public int getTemperature( int day )
    {
        return temperatures[day];
    }
    
    
    // Mutator methods
    public void setTemperature( int day, int newTemperature )
    {
        temperatures[day] = newTemperature;
    }
    
    // toString method
    @Override
    public String toString()
    {
       String temp = "";
       
       for( int i = 0; i < DAYS; i++ )
        {
            temp += ( temperatures[i] + " " );
        }
       return temp;
    }
    
    // equals method
    public boolean qeuals( int[] array )
    {
        if ( array.length != DAYS )
            return false;
        
        {
            for ( int i = 0; i < DAYS; i++ )
            {
                if ( array[i] != temperatures[i] )
                return false;
            }
            
        }
        
        return true;
    }
    
    // returns the number of temperatures that are bellow freezing
    public int bellowFreezing()
    {
        int size = 0;
        
        for( int i = 0; i < DAYS; i++ )
        {
            if( temperatures[i] < FREEZING )
                size++;
        }
        
        return size;
    }
    
    // returns an array of temperatures above 100 degrees
    public int[] aboveHundred()
    {
        int[] hot;
        int size = 0;
        int index = 0;
        
        for( int i = 0; i < DAYS; i ++ )
        {
            if( temperatures[i] > 100 )
                size++;
        }
        
        hot = new int[size];
        
        for( int i = 0; i < DAYS; i ++)
            if( temperatures[i] > 100 )
            {
                hot[index] = temperatures[i];
                index++; 
            }
        
        return hot;
        
    }
    
    // return the largest change in temperatures between any two consecutive days
    public int largestChange()
    {
        int largest = 0;
        int difference;
        
        for( int i = 0; i < DAYS; i++ )
        {
            for( int j = 0; j < DAYS; j++ )
            {
                difference = Math.abs(temperatures[i] - temperatures[j]);
                if ( difference > largest)
                    largest = difference;
            }
        }
        return largest;
    }
    
    // return an array of daily temperatures, sorted in descending order
    public int[] sort()
    {
        int temp;
        int max;
        
        for ( int i = 0; i < DAYS; i++ )
        {
            max = indexOfHighest( temperatures, DAYS - i );
            temp = temperatures[max];
            temperatures[max] = temperatures[ DAYS - i - 1 ];
            temperatures[ DAYS - i - 1 ] = temp;
        }
        
        return temperatures;
    }
    
    // the method that finds the highest temperature
    private int maxDegree( int[] array)
    {
        int highest = 0;
        
        // find the highest temperature
        for( int i = 0; i < array.length; i++ )
        {
            if( array[i] > highest )
                highest = array[i];
        }
        
        return highest;
    }
    
    private int indexOfHighest( int [] array, int size )
    {
        int index = 0;
        for ( int i = 1; i < size; i++ )
        {
            if( array[i] > array[index] )
                index = i;
        }
        return index;
    }
}

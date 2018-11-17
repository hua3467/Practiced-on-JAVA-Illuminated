/**
 * 9.10.7.86
 * @author ZhenhuaYang
 */
import java.util.Random;

public class SummerJobSalaries {

    private int [][] salaries;

    public SummerJobSalaries( int numPeople, int numYears ){

        salaries = new int[numPeople][numYears];

        Random rand = new Random();

        for( int i = 0; i < salaries.length; i++ ){
            for( int j = 0; j < salaries[i].length; j++ ){
                salaries[i][j] = rand.nextInt(5000) + 5000;
            }
        }

    }

    public int highestSalary (){
        int sum = 0;
        int calc = 0;
        int index = 0;

        for( int i = 0; i < salaries.length; i++ ){
            for( int j = 0; j < salaries[i].length; j++ ){
                calc += salaries[i][j];
            }
            if( sum < calc ){
                sum = calc;
                index = i;
            }

            calc = 0;
        }

        return index;
    }

    public int highestYear(){

        int highest = 0;
        int index = 0;

        for( int i = 0; i < salaries.length; i++ ){
            for( int j = 0; j < salaries[i].length; j++ ){
                if ( highest < salaries[i][j]) {
                    highest = salaries[i][j];
                    index = j;

                }
            }
        }

        return index;
    }

    public int sumSalary(){
        int sum = 0;

        for( int i = 0; i < salaries.length; i++ ){
            for( int j = 0; j < salaries[i].length; j++ ){

                sum += salaries[i][j];
            }
        }
        return sum;
    }

    public String toString( )
    {
        String str = "";
        for( int i = 0; i < salaries.length; i++){
            for( int j = 0; j < salaries[i].length; j++ ){
                if( j == salaries[i].length - 1 )
                    str += salaries[i][j] + "\n";
                else
                    str += salaries[i][j] + "\t";
            }
        }
        return str;
    }
}


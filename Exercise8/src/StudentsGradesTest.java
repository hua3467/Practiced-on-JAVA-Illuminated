/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaronyang
 */
public class StudentsGradesTest 
{
    public static void main( String[] args )
    {
        StudentsGrades grade = new StudentsGrades(1000);
        
        System.out.println( "The highest grade is " + grade.getHightestGrade());
        System.out.println( "The average grade is " + grade.getAverageGrade() );
        System.out.println( "The median grade is " + grade.getMidGrade() );
        System.out.println( "The mode of the array: " + grade.getMode());
        grade.sort();
        System.out.println( " The sorted array: " + grade.toString() );

    }
    
}

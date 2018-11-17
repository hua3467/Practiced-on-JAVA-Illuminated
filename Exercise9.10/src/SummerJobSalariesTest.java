public class SummerJobSalariesTest {
    public static void main( String [] args ){

        SummerJobSalaries newSalaries = new SummerJobSalaries(12, 5);

        System.out.println(newSalaries.highestSalary());
        System.out.println(newSalaries.highestYear());
        System.out.println(newSalaries.sumSalary());
        System.out.println(newSalaries.toString());
    }
}

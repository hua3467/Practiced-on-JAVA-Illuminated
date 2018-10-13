import java.text.DecimalFormat;
import java.util.Scanner;


public class Excercise {

    public static void main(String[] args) {

        double grade = .985;
        DecimalFormat percent = new DecimalFormat("#.0%");
        System.out.println(percent.format(grade));

        Scanner scan = new Scanner( System.in );

        System.out.print("Please enter a word: ");
        String input = scan.next();

        System.out.println(input.toUpperCase() + "\n"
        + input.toLowerCase() + "\n"
        + input);




}

}

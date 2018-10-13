import java.util.Scanner;

public class Excersises {

    public static void main(String [] args){

        final double PI = 3.14159;
        double radius;
        double circumference;

        Scanner inputRadius = new Scanner(System.in);

        System.out.print("Please enter a radius: ");
        radius = inputRadius.nextDouble();

        circumference = PI * 2 * radius;

        System.out.println(circumference);


    }

}

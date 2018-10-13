public class ArithmeticOperators {

    public static void main( String [ ] args){

        double salad = 5.96;
        double water = .89;
        System.out.println("The cost of lunch is $" + ( salad + water ));

        int targetYear = 2011;
        int birthYear = 1933;
        System.out.println("Your age in " + targetYear + " is " + ( targetYear - birthYear ));

        //calculate the total calories of apples
        int caloriesPerApple = 127;
        int numberOfApples = 3;
        System.out.println("The calories in " + numberOfApples + " apples is " + ( caloriesPerApple * numberOfApples));

        // calculate miles per gallon
        double miles = 426.8;
        double gallons = 15.2;
        double mileage = miles / gallons;
        System.out.println("The mileage is " + mileage + " miles per gallon. ");


    }

}

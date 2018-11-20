import java.util.Scanner;

public class BankAccountTest {
    public static void main( String [] args ) {

        BankAccount myAcnt = new BankAccount();
        String action = "";
        int input;
        boolean exit = false;

        Scanner scan = new Scanner(System.in);

        System.out.print("Welcome! How can I help you today: ");


        while ( exit == false ) {

            action = scan.next();
            if ( action.equals("q") || action.equals("quit")) {
                exit = true;
                System.out.println("Thank you for working with us. ");
                break;
            }

            switch (action) {
                case "Deposit":
                case "+": {
                    System.out.print("How much do you want to deposit? ");
                    input = scan.nextInt();
                    myAcnt.deposit(input);
                    break;
                }
                case "Withdraw":
                case "-": {
                    System.out.print("How much do you want to withdraw? ");
                    input = scan.nextInt();
                    while (input > myAcnt.checkBalance()) {
                        System.out.print("You cannot withdraw money greater than your balance, please try again: ");
                        input = scan.nextInt();
                    }
                    myAcnt.withdraw(input);
                    break;
                }
                case "Balance": {
                    System.out.print("\nYour balance is " + myAcnt.checkBalance() + "\n");
                    break;
                }

            }

            System.out.print("Anything else you want do: ");

        }

    }
}

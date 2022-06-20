import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculator {
    /* Interest Calculator by austin Carstens
    the purpose of the program is to determine the interest amount based on the interest  rate and loan amount.
     */

    public static void main(String args[]) {
        //setup variables

        Scanner scanner = new Scanner(System.in);

        NumberFormat percent = NumberFormat.getPercentInstance();
        NumberFormat dollar = NumberFormat.getCurrencyInstance();

        boolean valid;
        System.out.println("Welcome to the Interest Calculator");
        System.out.println("");
        while (valid = true) {
            // get input total
            System.out.println("Enter Loan amount: ");
            String userInput = scanner.nextLine();
            BigDecimal principal = BigDecimal.valueOf(Double.valueOf(userInput));


                // get interest rate input
                System.out.println("Enter Interest Rate");
                userInput = scanner.nextLine();
                // set big decimal class to interest
                BigDecimal interestRate = BigDecimal.valueOf(Double.valueOf(userInput));
                BigDecimal interest = principal.multiply(interestRate);
                System.out.println("Loan Amount:" + dollar.format(principal));
                System.out.println("Interest Rate:" + percent.format(interestRate));
                System.out.println("Interest:" + dollar.format(interest));
                System.out.println("Continue? (y/n) ");


            }







        }
    }


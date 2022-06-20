import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculator {
    /* Interest Calculator by austin Carstens
    the purpose of the program is to determine the interest amount based on the interest  rate and loan amount.
     */

    public static void main(String args[]) {

        String userInput = "";

        BigDecimal interestRate = new BigDecimal(userInput);
        Scanner scanner = new Scanner(System.in);

        NumberFormat percent = NumberFormat.getPercentInstance();
        NumberFormat dollar = NumberFormat.getCurrencyInstance();

        boolean valid = true;
        System.out.println("Welcome to the Interest Calculator");
        System.out.println("");
        while (valid = true) {
            System.out.println("Enter Loan amount: ");
                try {
                    userInput = scanner.nextLine();
                    BigDecimal principal = new BigDecimal(userInput);
                    if(principal.compareTo(BigDecimal.ZERO) > 0) {
                        valid = true;


                    } else if(principal.compareTo(BigDecimal.ZERO) <= 0) {
                    throw new Exception();
                    } else if(!userInput.matches("[0-9]+")) {


                    }
                } catch(Exception e) {
                    System.out.println("Invalid input, please try again");
                    valid = false;
                }
            {



            }


            System.out.println("Enter in Interest rate");




        }
    }









}

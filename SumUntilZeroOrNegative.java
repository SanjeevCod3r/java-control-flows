import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double total = 0.0;
        double number;

        System.out.println("Enter numbers to sum (enter 0 or a negative number to stop):");

        while (true) {
            System.out.print("Enter a number: ");
            number = input.nextDouble();

            if (number <= 0) {
                break; // Exit the loop if the user enters 0 or a negative number
            }

            total += number; // Add the entered number to the total
        }

        System.out.println("The total sum is: " + total);
    }
}

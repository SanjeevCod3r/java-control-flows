import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        int factorial = 1;
        int i = 1;

        while (i <= number) {
            factorial *= i;
            i++;
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
       
    }
}

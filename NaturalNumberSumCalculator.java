import java.util.Scanner;

public class NaturalNumberSumCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n < 1) {
            System.out.println("The number " + n + " is not a natural number.");
            return;
        }

        int sumUsingForLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumUsingForLoop += i;
        }

        int sumUsingFormula = (n * (n + 1)) / 2;

        System.out.println("Sum using for loop: " + sumUsingForLoop);
        System.out.println("Sum using formula (n*(n+1)/2): " + sumUsingFormula);

        if (sumUsingForLoop == sumUsingFormula) {
            System.out.println("Both methods give the same result. The computation is correct!");
        } else {
            System.out.println("The results are different. Something went wrong.");
        }
    }
}

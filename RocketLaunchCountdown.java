	import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the countdown start number: ");
        int counter = input.nextInt();

        while (counter >= 1) {
            System.out.println("Countdown: " + counter);
            counter--;  // Decrement the counter
        }

        System.out.println("Launch!");
    }
}


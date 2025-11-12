import java.util.Scanner;
import java.util.Random;

public class CoinTossing {

    // Enum to represent the two sides of a coin
    enum Coin { HEADS, TAILS }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int headsCount = 0;
        int tailsCount = 0;
        int choice;

        do {
            // Menu
            System.out.println("\n--- Coin Toss Simulator ---");
            System.out.println("1. Toss Coin");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 1) {
                // Call flip() to get the result
                Coin result = flip(random);

                // Display result
                System.out.println("Result: " + result);

                // Count heads and tails
                if (result == Coin.HEADS)
                    headsCount++;
                else
                    tailsCount++;

                // Display totals
                System.out.println("Heads: " + headsCount + " | Tails: " + tailsCount);
            }

        } while (choice != 2);

        System.out.println("\nFinal Results:");
        System.out.println("Heads: " + headsCount);
        System.out.println("Tails: " + tailsCount);
        System.out.println("Goodbye!");

        input.close();
    }

    // Method that simulates a coin toss
    public static Coin flip(Random random) {
        int toss = random.nextInt(2); // 0 or 1
        if (toss == 0)
            return Coin.HEADS;
        else
            return Coin.TAILS;
    }
}

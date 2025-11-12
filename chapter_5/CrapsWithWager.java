import java.util.Random;
import java.util.Scanner;

public class CrapsWithWager {

    private static final Random randomNumbers = new Random();

    // Enum to represent game status
    private enum Status { CONTINUE, WON, LOST }

    // Dice roll method
    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6); // 1–6
        int die2 = 1 + randomNumbers.nextInt(6); // 1–6
        int sum = die1 + die2;
        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }

    // Method to display random chatter
    public static void chatter() {
        String[] messages = {
            "Oh, you're going for broke, huh?",
            "Aw c'mon, take a chance!",
            "You're up big. Now's the time to cash in your chips!"
        };
        int index = randomNumbers.nextInt(messages.length);
        System.out.println(messages[index]);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bankBalance = 1000;
        System.out.println("Welcome to Craps! You have $" + bankBalance + " in your bank.");

        boolean playAgain = true;

        while (playAgain && bankBalance > 0) {
            int wager = 0;

            // Prompt user for wager
            do {
                System.out.print("Enter your wager: $");
                wager = input.nextInt();
                if (wager > bankBalance || wager <= 0) {
                    System.out.println("Invalid wager. It must be between $1 and your bank balance $" + bankBalance);
                }
            } while (wager > bankBalance || wager <= 0);

            int myPoint = 0;
            Status gameStatus;

            // First roll
            int sum = rollDice();

            switch (sum) {
                case 7:
                case 11:
                    gameStatus = Status.WON;
                    break;
                case 2:
                case 3:
                case 12:
                    gameStatus = Status.LOST;
                    break;
                default:
                    gameStatus = Status.CONTINUE;
                    myPoint = sum;
                    System.out.println("Point is " + myPoint);
                    break;
            }

            // Continue rolling if point established
            while (gameStatus == Status.CONTINUE) {
                chatter(); // display chatter
                sum = rollDice();

                if (sum == myPoint) {
                    gameStatus = Status.WON;
                } else if (sum == 7) {
                    gameStatus = Status.LOST;
                }
            }

            // Update bank balance
            if (gameStatus == Status.WON) {
                System.out.println("Player wins!");
                bankBalance += wager;
            } else {
                System.out.println("Player loses.");
                bankBalance -= wager;
            }

            System.out.println("Your new bank balance is: $" + bankBalance);

            if (bankBalance == 0) {
                System.out.println("Sorry. You busted!");
                break;
            }

            // Ask if player wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String response = input.next().toLowerCase();
            playAgain = response.equals("yes");
        }

        System.out.println("Thanks for playing! Final bank balance: $" + bankBalance);
        input.close();
    }
}

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain;

        do {
            // Generate a random number between 1 and 1000
            int numberToGuess = 1 + random.nextInt(1000);
            int guess = 0;
            int attempts = 0;

            System.out.println("I have chosen a number between 1 and 1000.");
            System.out.println("Try to guess it!");

            // Keep asking until the user guesses correctly
            while (guess != numberToGuess) {
                System.out.print("Enter your guess: ");
                guess = input.nextInt();
                attempts++;

                if (guess > numberToGuess) {
                    System.out.println("Too high. Try again.");
                } else if (guess < numberToGuess) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("🎉 Congratulations! You guessed the number in " + attempts + " tries!");
                }
            }

            // Ask if the user wants to play again
            System.out.print("Would you like to play again? (yes/no): ");
            String response = input.next().toLowerCase();

            playAgain = response.equals("yes");

        } while (playAgain);

        System.out.println("Thanks for playing! Goodbye 👋");
        input.close();
    }
}

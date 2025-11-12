import java.util.Scanner;
import java.util.Random;

public class GuessTheNumberModified {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain;

        do {
            int numberToGuess = 1 + random.nextInt(1000);
            int guess = 0;
            int attempts = 0;

            System.out.println("I have chosen a number between 1 and 1000.");
            System.out.println("Try to guess it!");

            // Loop until user guesses correctly
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

                    // Feedback based on number of attempts
                    if (attempts < 10) {
                        System.out.println("Either you know the secret or you got lucky!");
                    } else if (attempts == 10) {
                        System.out.println("Aha! You know the secret!");
                    } else {
                        System.out.println("You should be able to do better!");
                    }
                }
            }

            // Ask user if they want to play again
            System.out.print("Would you like to play again? (yes/no): ");
            String response = input.next().toLowerCase();
            playAgain = response.equals("yes");

        } while (playAgain);

        System.out.println("Thanks for playing! Goodbye 👋");
        input.close();
    }
}

import java.security.SecureRandom;
import java.util.Scanner;

public class CAIDifficultyLevels {

    private static final SecureRandom random = new SecureRandom();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Multiplication Learning Program with Difficulty Levels!");

        boolean continueProgram = true;

        while (continueProgram) {
            // Ask for difficulty level
            int difficulty = 0;
            do {
                System.out.print("Enter difficulty level (1 = single-digit, 2 = up to two-digit, 3 = up to three-digit): ");
                difficulty = input.nextInt();
                if (difficulty < 1 || difficulty > 3) {
                    System.out.println("Invalid difficulty level. Please enter 1, 2, or 3.");
                }
            } while (difficulty < 1 || difficulty > 3);

            System.out.println("You selected difficulty level " + difficulty + ". Let's begin!\n");

            // Ask 10 questions
            int correctCount = 0;
            for (int i = 0; i < 10; i++) {
                boolean correct = askQuestion(difficulty);
                if (correct) {
                    correctCount++;
                    displayCorrectResponse();
                } else {
                    displayIncorrectResponse();
                }
            }

            int percentage = (correctCount * 100) / 10;
            System.out.println("\nYou answered " + correctCount + " out of 10 questions correctly.");
            System.out.println("Your score: " + percentage + "%");

            if (percentage < 75) {
                System.out.println("Please ask your teacher for extra help.");
            } else {
                System.out.println("Congratulations, you are ready to go to the next level!");
            }

            // Ask if another student wants to try
            System.out.print("\nWould another student like to try? (yes/no): ");
            String response = input.next().toLowerCase();
            continueProgram = response.equals("yes");
            System.out.println();
        }

        System.out.println("Thank you for using the CAI program!");
        input.close();
    }

    // Method to ask a single multiplication question based on difficulty
    public static boolean askQuestion(int difficulty) {
        int maxNumber = (int) Math.pow(10, difficulty) - 1;
        int number1 = 1 + random.nextInt(maxNumber);
        int number2 = 1 + random.nextInt(maxNumber);
        int correctAnswer = number1 * number2;
        int userAnswer;

        do {
            System.out.printf("How much is %d times %d? ", number1, number2);
            userAnswer = input.nextInt();

            if (userAnswer == correctAnswer) {
                return true;
            } else {
                displayIncorrectResponse();
            }

        } while (userAnswer != correctAnswer);

        return true;
    }

    // Random correct response
    public static void displayCorrectResponse() {
        int choice = 1 + random.nextInt(4);
        switch (choice) {
            case 1 -> System.out.println("Very good!");
            case 2 -> System.out.println("Excellent!");
            case 3 -> System.out.println("Nice work!");
            case 4 -> System.out.println("Keep up the good work!");
        }
    }

    // Random incorrect response
    public static void displayIncorrectResponse() {
        int choice = 1 + random.nextInt(4);
        switch (choice) {
            case 1 -> System.out.println("No. Please try again.");
            case 2 -> System.out.println("Wrong. Try once more.");
            case 3 -> System.out.println("Don't give up! No.");
            case 4 -> System.out.println("Keep trying.");
        }
    }
}

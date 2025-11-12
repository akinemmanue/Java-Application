import java.security.SecureRandom;
import java.util.Scanner;

public class MultiplicationCAIVaried {

    private static final SecureRandom random = new SecureRandom();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Multiplication Learning Program with Varied Responses!");
        generateQuestion(); // Start the first question
        System.out.println("Great job! You have completed the session.");
        input.close();
    }

    // Method to generate a multiplication question
    public static void generateQuestion() {
        int number1 = 1 + random.nextInt(9); // 1–9
        int number2 = 1 + random.nextInt(9); // 1–9
        int correctAnswer = number1 * number2;
        int userAnswer;

        do {
            System.out.printf("How much is %d times %d? ", number1, number2);
            userAnswer = input.nextInt();

            if (userAnswer == correctAnswer) {
                displayCorrectResponse();
                // Generate a new question
                generateQuestion();
                return; // exit current method after generating new question
            } else {
                displayIncorrectResponse();
            }

        } while (userAnswer != correctAnswer);
    }

    // Method to display a random correct answer response
    public static void displayCorrectResponse() {
        int choice = 1 + random.nextInt(4); // 1–4
        switch (choice) {
            case 1:
                System.out.println("Very good!");
                break;
            case 2:
                System.out.println("Excellent!");
                break;
            case 3:
                System.out.println("Nice work!");
                break;
            case 4:
                System.out.println("Keep up the good work!");
                break;
        }
    }

    // Method to display a random incorrect answer response
    public static void displayIncorrectResponse() {
        int choice = 1 + random.nextInt(4); // 1–4
        switch (choice) {
            case 1:
                System.out.println("No. Please try again.");
                break;
            case 2:
                System.out.println("Wrong. Try once more.");
                break;
            case 3:
                System.out.println("Don't give up! No.");
                break;
            case 4:
                System.out.println("Keep trying.");
                break;
        }
    }
}

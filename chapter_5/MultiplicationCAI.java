import java.security.SecureRandom;
import java.util.Scanner;

public class MultiplicationCAI {

    private static final SecureRandom random = new SecureRandom();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Multiplication Learning Program!");

        // Generate the first question
        generateQuestion();

        System.out.println("Great job! You have completed the session.");
        input.close();
    }

    // Method to generate a new multiplication question
    public static void generateQuestion() {
        int number1 = 1 + random.nextInt(9); // 1–9
        int number2 = 1 + random.nextInt(9); // 1–9
        int correctAnswer = number1 * number2;
        int userAnswer;

        do {
            System.out.printf("How much is %d times %d? ", number1, number2);
            userAnswer = input.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Very good!");
                // Ask a new question recursively
                generateQuestion();
                return; // exit current method after generating new question
            } else {
                System.out.println("No. Please try again.");
            }
        } while (userAnswer != correctAnswer);
    }
}

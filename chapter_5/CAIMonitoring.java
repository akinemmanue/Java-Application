import java.security.SecureRandom;
import java.util.Scanner;

public class CAIMonitoring {

    private static final SecureRandom random = new SecureRandom();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Multiplication Learning Program!");
        boolean continueProgram = true;

        while (continueProgram) {
            int correctCount = 0;
            int incorrectCount = 0;

            // Ask 10 questions
            for (int i = 1; i <= 10; i++) {
                boolean correct = askQuestion();
                if (correct) {
                    correctCount++;
                    displayCorrectResponse();
                } else {
                    incorrectCount++;
                    displayIncorrectResponse();
                }
            }

            // Calculate percentage correct
            int percentage = (correctCount * 100) / 10;
            System.out.println("\nYou answered " + correctCount + " out of 10 questions correctly.");
            System.out.println("Your score: " + percentage + "%");

            // Give feedback
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

    // Method to ask a single multiplication question
    public static boolean askQuestion() {
        int number1 = 1 + random.nextInt(9);
        int number2 = 1 + random.nextInt(9);
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

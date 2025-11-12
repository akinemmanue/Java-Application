import java.security.SecureRandom;
import java.util.Scanner;

public class CAIArithmetic {

    private static final SecureRandom random = new SecureRandom();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Arithmetic Learning Program!");

        boolean continueProgram = true;

        while (continueProgram) {
            // Ask for difficulty level
            int difficulty = 0;
            do {
                System.out.print("Enter difficulty level (1 = single-digit, 2 = two-digit, 3 = three-digit): ");
                difficulty = input.nextInt();
                if (difficulty < 1 || difficulty > 3) {
                    System.out.println("Invalid difficulty level. Please enter 1, 2, or 3.");
                }
            } while (difficulty < 1 || difficulty > 3);

            // Ask for type of arithmetic problem
            int problemType = 0;
            do {
                System.out.println("Choose the type of problem to study:");
                System.out.println("1 = Addition");
                System.out.println("2 = Subtraction");
                System.out.println("3 = Multiplication");
                System.out.println("4 = Division");
                System.out.println("5 = Random mixture of all types");
                System.out.print("Enter your choice: ");
                problemType = input.nextInt();
                if (problemType < 1 || problemType > 5) {
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            } while (problemType < 1 || problemType > 5);

            System.out.println("Let's begin!\n");

            // Ask 10 questions
            int correctCount = 0;
            for (int i = 0; i < 10; i++) {
                boolean correct = askQuestion(difficulty, problemType);
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

        System.out.println("Thank you for using the Arithmetic Learning Program!");
        input.close();
    }

    // Method to ask a single question based on difficulty and problem type
    public static boolean askQuestion(int difficulty, int problemType) {
        int maxNumber = (int) Math.pow(10, difficulty) - 1;
        int number1 = 1 + random.nextInt(maxNumber);
        int number2 = 1 + random.nextInt(maxNumber);

        int actualProblemType = problemType;

        // If random mixture selected
        if (problemType == 5) {
            actualProblemType = 1 + random.nextInt(4); // 1–4
        }

        int correctAnswer = 0;
        String operator = "";

        switch (actualProblemType) {
            case 1 -> { // Addition
                correctAnswer = number1 + number2;
                operator = "+";
            }
            case 2 -> { // Subtraction
                if (number1 < number2) { // Ensure non-negative result
                    int temp = number1;
                    number1 = number2;
                    number2 = temp;
                }
                correctAnswer = number1 - number2;
                operator = "-";
            }
            case 3 -> { // Multiplication
                correctAnswer = number1 * number2;
                operator = "×";
            }
            case 4 -> { // Division
                // Ensure exact division
                correctAnswer = number1; // result
                number1 = number1 * number2; // dividend
                operator = "÷";
            }
        }

        int userAnswer;
        do {
            System.out.printf("How much is %d %s %d? ", number1, operator, number2);
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

import java.util.Scanner;

public class SeparateDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number between 1 and 99999
        System.out.print("Enter an integer between 1 and 99999: ");
        int number = input.nextInt();

        // Call displayDigits method
        displayDigits(number);
    }

    // (a) Method to calculate the integer part of the quotient
    public static int integerQuotient(int a, int b) {
        return a / b;  // integer division
    }

    // (b) Method to calculate the remainder
    public static int integerRemainder(int a, int b) {
        return a % b;  // remainder
    }

    // (c) Method to display digits separated by two spaces
    public static void displayDigits(int number) {
        int divisor = 1;

        // Find the correct divisor to get the first digit (e.g., 4562 → divisor = 1000)
        while (integerQuotient(number, divisor) >= 10) {
            divisor *= 10;
        }

        // Extract and display each digit with two spaces
        while (divisor > 0) {
            int digit = integerQuotient(number, divisor); // get the current digit
            System.out.print(digit + "  "); // print the digit with 2 spaces

            // Remove that digit from the number
            number = integerRemainder(number, divisor);
            divisor = integerQuotient(divisor, 10); // reduce divisor by one digit
        }

        System.out.println(); // move to next line after printing
    }
}

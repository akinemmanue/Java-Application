import java.util.Scanner;

public class ReverseDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Call the reverse method
        int reversedNumber = reverse(number);

        // Display the reversed number
        System.out.println("The number with digits reversed is: " + reversedNumber);

        input.close();
    }

    // Method to reverse the digits of a number
    public static int reverse(int number) {
        int reverse = 0;

        // Loop to extract each digit and rebuild the reversed number
        while (number != 0) {
            int digit = number % 10;          // Get last digit
            reverse = reverse * 10 + digit;   // Append digit to reversed number
            number = number / 10;             // Remove last digit
        }

        return reverse;
    }
}

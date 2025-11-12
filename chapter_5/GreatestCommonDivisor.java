import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for two numbers
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        // Call gcd method
        int result = gcd(num1, num2);

        // Display the result
        System.out.println("The Greatest Common Divisor (GCD) is: " + result);

        input.close();
    }

    // Method to calculate GCD using Euclid’s algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;  // remainder
            a = temp;
        }
        return a;
    }
}

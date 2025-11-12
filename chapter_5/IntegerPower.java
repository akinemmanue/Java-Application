import java.util.Scanner;

public class IntegerPower {

    // Method to calculate base^exponent without using Math.pow
    public static int integerPower(int base, int exponent) {
        int result = 1;

        // Multiply base by itself exponent times
        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }

        return result; // return the final result
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read base and exponent from the user
        System.out.print("Enter the base: ");
        int base = input.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = input.nextInt();

        // Call the integerPower method
        int power = integerPower(base, exponent);

        // Display the result
        System.out.printf("%d raised to the power %d is %d%n", base, exponent, power);
    }
}

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for three numbers
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = input.nextDouble();

        // Call the minimum3 method
        double smallest = minimum3(num1, num2, num3);

        // Display the result
        System.out.printf("The smallest value is: %.2f%n", smallest);

        input.close();
    }

    // Method to find the smallest of three numbers using Math.min
    public static double minimum3(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
    }
}

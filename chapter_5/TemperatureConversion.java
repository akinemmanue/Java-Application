import java.util.Scanner;

public class TemperatureConversion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user which conversion they want
        System.out.println("Temperature Conversion Program");
        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = input.nextInt();

        if (choice == 1) {
            // Fahrenheit to Celsius
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = input.nextDouble();
            double celsiusValue = celsius(fahrenheit);
            System.out.printf("Equivalent Celsius temperature: %.2f°C%n", celsiusValue);
        } 
        else if (choice == 2) {
            // Celsius to Fahrenheit
            System.out.print("Enter temperature in Celsius: ");
            double celsius = input.nextDouble();
            double fahrenheitValue = fahrenheit(celsius);
            System.out.printf("Equivalent Fahrenheit temperature: %.2f°F%n", fahrenheitValue);
        } 
        else {
            System.out.println("Invalid choice! Please enter 1 or 2.");
        }

        input.close();
    }

    // (a) Method to convert Fahrenheit to Celsius
    public static double celsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    // (b) Method to convert Celsius to Fahrenheit
    public static double fahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }
}

import java.util.Scanner;

public class DistanceBetweenPoints {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to enter coordinates for both points
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        // Call the distance method
        double result = distance(x1, y1, x2, y2);

        // Display the result
        System.out.printf("The distance between the two points is: %.2f%n", result);

        input.close();
    }

    // Method to calculate distance using the distance formula
    public static double distance(double x1, double y1, double x2, double y2) {
        // Formula: √((x2 - x1)² + (y2 - y1)²)
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }
}

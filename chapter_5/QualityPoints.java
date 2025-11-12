import java.util.Scanner;

public class QualityPoints {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for the student's average
        System.out.print("Enter the student's average: ");
        int average = input.nextInt();

        // Call the method and store the result
        int points = qualityPoints(average);

        // Display the result
        System.out.println("The student's quality points are: " + points);

        input.close();
    }

    // Method to determine quality points based on average
    public static int qualityPoints(int average) {
        if (average >= 90 && average <= 100)
            return 4;
        else if (average >= 80 && average <= 89)
            return 3;
        else if (average >= 70 && average <= 79)
            return 2;
        else if (average >= 60 && average <= 69)
            return 1;
        else
            return 0;
    }
}

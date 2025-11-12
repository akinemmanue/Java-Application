public class PerfectNumbers {

    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 1000:\n");

        for (int number = 1; number <= 1000; number++) {
            if (isPerfect(number)) {
                System.out.print(number + " = ");
                displayFactors(number);
                System.out.println(); // move to the next line
            }
        }
    }

    // Method to check if a number is perfect
    public static boolean isPerfect(int number) {
        int sum = 0;

        // Find all factors except the number itself
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Return true if sum of factors equals the number
        return sum == number;
    }

    // Method to display the factors of a perfect number
    public static void displayFactors(int number) {
        boolean first = true;
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                if (!first) {
                    System.out.print(" + ");
                }
                System.out.print(i);
                first = false;
                sum += i;
            }
        }

        System.out.print(" = " + sum);
    }
}

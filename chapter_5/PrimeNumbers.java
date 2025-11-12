public class PrimeNumbers {

    public static void main(String[] args) {
        System.out.println("Prime numbers less than 10,000:\n");

        int count = 0; // count how many primes found

        // Loop through numbers from 2 to 9999
        for (int number = 2; number < 10000; number++) {
            if (isPrimeSqrt(number)) {  // You can switch to isPrimeHalf(number) to compare
                System.out.print(number + " ");
                count++;
            }
        }

        System.out.println("\n\nTotal prime numbers found: " + count);
    }

    // (a) Method 1: Check if number is prime (basic way — test up to n/2)
    public static boolean isPrimeHalf(int n) {
        if (n < 2) return false; // 0 and 1 are not prime

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false; // divisible by something other than 1 and itself
            }
        }
        return true; // prime
    }

    // (c) Optimized Method: Check if number is prime (test up to √n)
    public static boolean isPrimeSqrt(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

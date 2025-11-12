public class NumberSystemsTable {

    public static void main(String[] args) {
        // Print table header
        System.out.printf("%-8s %-10s %-8s %-10s%n", "Decimal", "Binary", "Octal", "Hexadecimal");
        System.out.println("---------------------------------------------------");

        // Loop through numbers 1 to 256
        for (int i = 1; i <= 256; i++) {
            String binary = Integer.toBinaryString(i);
            String octal = Integer.toOctalString(i);
            String hex = Integer.toHexString(i).toUpperCase(); // uppercase for hex

            // Print row
            System.out.printf("%-8d %-10s %-8s %-10s%n", i, binary, octal, hex);
        }
    }
}

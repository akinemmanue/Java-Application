public class RandomSets {
    public static void main(String[] args) {
        // (a) 2, 4, 6, 8, 10 → all even numbers starting at 2, increasing by 2
        int a = 2 * ((int)(Math.random() * 5) + 1);
        
        // (b) 3, 5, 7, 9, 11 → all odd numbers starting at 3, increasing by 2
        int b = 2 * ((int)(Math.random() * 5) + 1) + 1;
        
        // (c) 6, 10, 14, 18, 22 → start at 6, add 4 each step
        int c = 6 + 4 * (int)(Math.random() * 5);
        
        System.out.println("Random number from set (a): " + a);
        System.out.println("Random number from set (b): " + b);
        System.out.println("Random number from set (c): " + c);
    }
}

import java.util.Scanner;

public class RoundingNumbers{
	
	public static void main(String[] args){
		roundingNumbers();
	}
	
	public static void roundingNumbers(){
		System.out.print("Enter a floating number: ");
		Scanner input = new Scanner(System.in);
		
		double x = input.nextDouble();
		
		// math.floor is use for rounding numbers down
		// math.floor(x + 0.5) rounds x to the nearest integer
		double y = Math.floor(x + 0.5);
		System.out.printf("Original: %.2f → Rounded: %.0f%n", x, y);
	}
}
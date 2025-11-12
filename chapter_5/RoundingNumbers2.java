import java.util.Scanner;

public class RoundingNumbers2{
	
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
		double tenths = Math.floor(x * 10 + 0.5) / 10;
		double hundredths = Math.floor(x * 100 + 0.5) / 100;
		double thousandths = Math.floor(x * 1000 + 0.5) / 1000;
		
		System.out.printf("Original: %.4f → Rounded to integer: %.0f%n", x, y);
		System.out.printf("Original: %.4f → Rounded to tenths: %.1f%n", x, tenths);
		System.out.printf("Original: %.4f → Rounded to hundredths: %.2f%n", x, hundredths);
		System.out.printf("Original: %.4f → Rounded to thousandths: %.3f%n", x, thousandths);

	}
}
import java.util.Scanner;
public class Hypotenuse{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter side one: ");
		int side1 = input.nextInt();
		
		System.out.print("Enter side two: ");
		int side2 = input.nextInt();
		
		double finalResult = hypotenuse(side1, side2);
		System.out.printf("The hypotenuse is: %.2f%n", finalResult);
	}
	
	public static double hypotenuse(int side1, int side2){
		double result = Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));
		return result;
	}
	
}
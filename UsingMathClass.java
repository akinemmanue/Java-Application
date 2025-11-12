import java.util.Scanner;

public class UsingMathClass{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any number of your choice: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter any number of your choice: ");
		int num2 = input.nextInt();
		
		System.out.print("Enter any number to find the square root: ");
		int squareRootNum = input.nextInt();
		
		int castedSquareRootNum = (int) Math.sqrt(squareRootNum);
		// Math.abs convert negative numbers to positive numbers
		System.out.printf("The absolute value of the number is %d %d%n",Math.abs(num1), Math.abs(num2));
		
		// Math.max return the maximum number from the two giving numbers
		System.out.printf("The Maximum number is %d%n", Math.max(num1,num2));
		
		// Math.min return the minimum number from the two giving numbers
		System.out.printf("The Minimum number is %d%n", Math.min(num1,num2));

		// Math.sqrt return the square root of a number (a square root of a number is when u mutiply a number by it self and give same number back)
		System.out.printf("The square root is %d%n", castedSquareRootNum);
		
		// Math.pow(a,b) a rasied to the power of b
		System.out.printf("The answer is %f%n", Math.pow(num1,2)*Math.pow(num2,2));
	
		// Math.random returns a random double number;
		System.out.printf("The random number is %f%n", Math.random());
	}
}

/*
Stack

A stack is a data structure that follows the rule: Last In, First out

*/
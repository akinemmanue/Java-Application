import java.util.Scanner;

public class LargestSecondLargest{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a random number 1: ");
		int acceptNumber = input.nextInt();
		int largestNumber = acceptNumber;
		int secondLargestNumber = Integer.MIN_VALUE;
		
		int count = 1;
		
		while(count < 10){
			System.out.print("Enter a random number 1: ");
			acceptNumber = input.nextInt();
			
			if(acceptNumber > largestNumber){
				secondLargestNumber = largestNumber;
				largestNumber = acceptNumber;
			}
			
			if(acceptNumber < largestNumber && acceptNumber > secondLargestNumber){
				secondLargestNumber = acceptNumber;
			}

			
			count++;
		
		}
		
		System.out.printf("Largest number: %d%n",largestNumber);
		System.out.printf("Second largest number: %d%n",secondLargestNumber);
	
		input.close();
		
		
	}
	
}
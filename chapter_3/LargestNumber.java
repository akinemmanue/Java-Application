import java.util.Scanner;
public class LargestNumber{
		
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int counter = 1;
		System.out.print("Enter a random number: ");
		int acceptDigit = input.nextInt();
		int storeNumber = acceptDigit; 
		
		while (counter < 10){

			System.out.print("Enter a random number: ");
			acceptDigit = input.nextInt();
			
			
			if(acceptDigit > storeNumber){
				storeNumber = acceptDigit;
			}
			counter++;
		}
		
		System.out.printf("Highest number: %d", storeNumber);
	}
	
}
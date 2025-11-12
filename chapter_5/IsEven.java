import java.util.Scanner;
public class IsEven{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a random number: ");
		int num1 = input.nextInt();
		
		while(true){
			
			if(num1 == 0){
				System.out.print("Program ends.");
				break;
			}
			
			boolean result = isEven(num1);
			System.out.println(result);
			
			System.out.print("Enter a random number: ");
			num1 = input.nextInt();
		}
	}
	
	public static boolean isEven(int num1){
		
		return num1 % 2 == 0;
		
	}
	
}
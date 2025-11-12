import java.util.Scanner;
public class AnyCharacter{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a random number: ");
		int num = input.nextInt();
		
		System.out.print("Enter any character: ");
		char symbol = input.next().charAt(0);
		
		anyCharacter(num, symbol);
		
		input.close();
	}
	
	public static void anyCharacter(int num, char symbol){
		for(int i = 0; i < num; i++){
			for(int j = 0; j < num; j++){
				System.out.print(symbol);
			}
			System.out.println(); 
		}
	}
	
}
import java.util.Scanner;
public class SquareOfAsterisks{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a random number: ");
		int num = input.nextInt();
		squareOfAsterisks(num);
		
		input.close();
	}
	
	public static void squareOfAsterisks(int num){
		
		for(int i = 0; i < num; i++){
			for(int j = 0; j < num; j++){
				System.out.print("*");
			}
			System.out.println(); 
		}
	}
	
	
	
}
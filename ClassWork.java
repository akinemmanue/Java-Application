import java.util.Scanner;

public class ClassWork{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int num;
		int negativeCounter = 0;
		int positiveCounter = 0;
		int zeroCounter = 0;
		
		while(true){
			System.out.print("Enter a random number (-1 to quit): ");
			num = input.nextInt();
			
			if(num == -1){
				break;
			}
			
			if(num < 0){
				negativeCounter++;
			}else if(num > 0){
				positiveCounter++;
			}else{
				zeroCounter ++;
			}
			
			
		}
		
		System.out.printf("Positive count: %d%n", positiveCounter);
		System.out.printf("negative count: %d%n", negativeCounter);
		System.out.printf("Zero count: %d%n", zeroCounter);
		
	}
}
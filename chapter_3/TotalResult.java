import java.util.Scanner;

public class TotalResult{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int acceptResult;
		int count = 0;
		int passed = 0;
		int failed = 0;
		
		
		while(count < 10){
			System.out.print("Enter result(1: pass 2: fail): ");
			acceptResult = input.nextInt();
			
			if(acceptResult == 1){
				passed++;
				count++;
			}else if(acceptResult == 2){
				failed++;
				count++;
			}else{
				System.out.println("Enter a valid number");
				System.out.println(count);
			}
			
			
			
		}
		
		System.out.println("");
		System.out.println("All 10 results entered successfully!");
		System.out.println("*******************************");
		System.out.printf("Total passed: %d%n",passed);
		System.out.printf("Total failed: %d%n",failed);
		System.out.println("*******************************");
		System.out.println("");
		input.close();
	}
}
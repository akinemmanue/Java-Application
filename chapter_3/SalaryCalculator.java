import java.util.Scanner;

public class SalaryCalculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int item1, item2, item3, item4;
		double totalItemSold = 0;
		double earnings;
		
		while(true){
			System.out.print("Enter number of sold for item 1 (-1 to quit): ");
			item1 = input.nextInt();
			
			if(item1 == -1){
				System.out.println("Done!!!");
				break;
			}
			
			System.out.print("Enter number of sold for item 2: ");
			item2 = input.nextInt();
			
			System.out.print("Enter number of sold for item 3: ");
			item3 = input.nextInt();
			
			System.out.print("Enter number of sold for item 4: ");
			item4 = input.nextInt();
			
			double item1Sold = item1 * 239.99;
			double item2Sold = item2 * 129.75;
			double item3Sold = item3 * 99.95;	
			double item4Sold = item4 * 350.89;	
			
			totalItemSold += item1Sold + item2Sold + item3Sold + item4Sold;
		}
		
		System.out.printf("Total sales: %.2f%n", totalItemSold);
		earnings = 200 + (0.09 * totalItemSold);
		System.out.printf("Total pay: %.2f%n", earnings);
		
		input.close();
	}
}
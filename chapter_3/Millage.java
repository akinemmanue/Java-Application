import java.util.Scanner;

public class Millage{
	
	public static void main(String[] args){
		
		// intializing the scanner class
		Scanner input = new Scanner(System.in);
	
		int totalGallons = 0;
		int totalMiles = 0;
		
		while (true){
			
			System.out.print("Miles drive (enter -1 to quit): ");
			int miles = input.nextInt();
			
			if(miles == -1){
				System.out.println("Program ends here");
				break;
			}
			
			while(miles < 0){
				System.out.print("Miles drive (enter -1 to quit): ");
				miles = input.nextInt();			
			}
			
			System.out.print("Gallon Used (enter -1 to quit): ");
			int gallon = input.nextInt();
			
			if(gallon == -1){
				System.out.println("Program ends here");
				break;
			}
			
			while(gallon < 0){
				System.out.print("Gallon Used (enter -1 to quit): ");
				gallon = input.nextInt();			
			}
			
			
			
			totalGallons += gallon;
			totalMiles += miles;
			
			// returning value
			double totalMillage = (double) miles / gallon;
			System.out.printf("Millage used: %.2f%n",totalMillage);
			
		}
		
		if(totalMiles == 0 && totalGallons == 0){
			System.out.println("Unable to calculate due to empty values");
		}else{
			double maxTotal = (double) totalMiles / totalGallons;
			System.out.printf("The max total: %.2f%n", maxTotal);
		}
		
		input.close();
		
		
	}
	
}
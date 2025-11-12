import java.util.Scanner;

public class ParkingCalculator{
	
	public static void main(String[] args){
		
		calculateCharges();
		
	}
	
	public static void calculateCharges(){
		System.out.println();
		System.out.println("--- Parking Garage Fee Calculator ---");
		
		Scanner input = new Scanner(System.in);
		
		double charge = 0;
		char symbol = '$';
		double totalCharge = 0;
		double allCharges = 0;
		
		while (true){
			
			charge = 0;
			System.out.print("Enter hour parked (-1 or 0 to end): ");
			int hours = input.nextInt();
			
			if(hours == -1 || hours == 0){
				break;
			}
			
			if(hours <= 3){
				charge = 2.00;
				totalCharge = charge;
			}else if(hours > 3){
				for(int i = 0; i < hours - 3; i++){
					charge += 0.50;
				}
				
				totalCharge = charge + 2.00;
				if(totalCharge > 10){
					totalCharge = 10;
				}
			}
			
			System.out.printf("Charge for this customer:\t%c%.2f%n",symbol,totalCharge);
		
			allCharges += totalCharge;	
		}
		
		System.out.printf("Total receipts so far: %c%.2f%n",symbol,allCharges);
		System.out.println("Thank you for using the Parking Garage Fee Calculator!");
		System.out.println();
	}
}
import java.util.Scanner;

public class CreditLimit{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int accountNumber; //a unique number identifying the customer.
		int balanceBegin; //how much they already owed before new purchases
		int totalCharged; //how much they spent (added to the balance)
		int totalCredit; //any payments or returns (subtract from the balance)
		int allowedCredit; //the maximum amount they are allowed to owe
		int balance; // balance remaining after calculation
		
		
		while (true){
			System.out.print("Enter account number (enter -1 to quit): ");
			accountNumber = input.nextInt();
			
			if(accountNumber == -1){
				System.out.println("Done!!!");
				break;
			}
			
			System.out.print("Enter balance at the beginning of the month: ");
			balanceBegin = input.nextInt();
			
			System.out.print("Enter total of all items charged this month: ");
			totalCharged = input.nextInt();
			
			System.out.print("Enter total of all credits applied this month: ");
			totalCredit = input.nextInt();
			
			System.out.print("Enter allowed credit limit: ");
			allowedCredit = input.nextInt();
			
			balance = balanceBegin + totalCharged - totalCredit;
			
			if(balance > allowedCredit){
				System.out.println("Credit limit exceeded");
			}else{
				System.out.printf("Your balance is: %d%n",balance);
			}

		}
		
		input.close();
			
	}
	
}
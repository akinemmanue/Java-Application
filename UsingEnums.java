import java.util.Scanner;
public class UsingEnums{
	
	public enum AccountType{
		SAVINGS,
		CURRENT,
		FIXED_DEPOSIT
	}
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Account type as (SAVINGS, CURRENT OR FIXED_DEPOSIT): ");
		
		System.out.print("please enter account type: ");
		String userChoice = scan.nextLine().toUpperCase();
		
		AccountType selectedType  = null;
		
		if(userChoice.equals("SAVINGS")){
			selectedType = AccountType.SAVINGS;
			System.out.println("Account was created successfully");
		}else if(userChoice.equals("CURRENT")){
			selectedType = AccountType.CURRENT;
			System.out.println("Account was created successfully");
		}else if(userChoice.equals("FIXED_DEPOSIT")){
			selectedType = AccountType.FIXED_DEPOSIT;
			System.out.println("Account was created successfully");
		}
		
		if(selectedType != null){
			System.out.println("Selected type is " + selectedType);
		}else{
			System.out.println("Invalid Account Type");
		}
	}
	
}
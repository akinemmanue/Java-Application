import java.util.Scanner;
public class GrossPay{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int rate = 20;
		System.out.print("Enter a employee1: ");
		int employee1 = input.nextInt();
		System.out.print("Enter a employee2: ");
		int employee2 = input.nextInt();
		System.out.print("Enter a employee3: ");
		int employee3 = input.nextInt();
		double pay;
		
		if(employee1 < 0 || employee2 <  0 || employee3 < 0){
			System.out.println("Enter a valid value");
			return;
		}
		
		if(employee1 <= 40){
			pay = employee1 * rate;
			System.out.printf("Employee1 %.2f%n",pay);
		}else{
			pay = 40 * rate + (employee1 - 40) * rate * 1.5;
			System.out.printf("Employee1 %.2f%n",pay);
		}
		
		
		if(employee2 <= 40){
			pay = employee2 * rate;
			System.out.printf("Employee2 %.2f%n",pay);
		}else{
			pay = 40 * rate + (employee2 - 40) * rate * 1.5;
			System.out.printf("Employee2 %.2f%n",pay);
		}
		
		if(employee3 <= 40){
			pay = employee3 * rate;
			System.out.printf("Employee3 %.2f%n",pay);
		}else{
			pay = 40 * rate + (employee3 - 40) * rate * 1.5;
			System.out.printf("Employee3 %.2f%n",pay);
		}
		
		
		
		
		
		
		
		
		
	}
	
}
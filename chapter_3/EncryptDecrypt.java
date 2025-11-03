import java.util.Scanner;
public class EncryptDecrypt{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a digit to encrypt: ");
		int value1 = input.nextInt();
		
		System.out.print("Enter a digit to encrypt: ");
		int value2 = input.nextInt();
		
		System.out.print("Enter a digit to encrypt: ");
		int value3 = input.nextInt();
		
		System.out.print("Enter a digit to encrypt: ");
		int value4 = input.nextInt();
		
		int holdValue1 = (value1 + 7) % 10;
		int holdValue2 = (value2 + 7) % 10;
		int holdValue3 = (value3 + 7) % 10;
		int holdValue4 = (value4 + 7) % 10;
		System.out.printf("Encrypted value: %d %d %d %d%n",holdValue4, holdValue3, holdValue2, holdValue1);
		
		//Decryption
		System.out.print("Enter a digit to decrypt: ");
		int dValue1 = input.nextInt();
		
		System.out.print("Enter a digit to decrypt: ");
		int dValue2 = input.nextInt();
		
		System.out.print("Enter a digit to decrypt: ");
		int dValue3 = input.nextInt();
		
		System.out.print("Enter a digit to decrypt: ");
		int dValue4 = input.nextInt();
		
		int dHoldValue1 = (dValue1 + 10 - 7) % 10;
		int dHoldValue2 = (dValue2 + 10 - 7) % 10;
		int dHoldValue3 = (dValue3 + 10 - 7) % 10;
		int dHoldValue4 = (dValue4 + 10 - 7) % 10;
		System.out.printf("Decrypted value: %d%d%d%d%n",dHoldValue1, dHoldValue2, dHoldValue3, dHoldValue4);
		
	}
}
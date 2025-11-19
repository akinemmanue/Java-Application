import java.util.Random;
public class UsingRandomClass{
	
	public static void main(String[] args){
		Random random = new Random();
		
		int number = random.nextInt();
		System.out.printf("The number generated (positive or negative)%d%n",number);
		
		//it genarate only  positive numbers
		System.out.printf("The number generated (Only positive number) %d%n",Math.abs(number));
		
		// It genarate a positive number from 0 - 9;
		int myNumber = random.nextInt(10);
		System.out.printf("My generated number is %d%n",myNumber);
		
		double myDoubleNumber = random.nextDouble();
		System.out.printf("My generated float-point number is %f%n",myDoubleNumber);
		
		boolean isFun = random.nextBoolean();
		System.out.printf("Is java fun: %b%n",isFun);
	}
	
}

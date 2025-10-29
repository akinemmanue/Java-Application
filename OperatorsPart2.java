public class OperatorsPart2{
	
	public static void main(String[] args){
			
		int num1 = 30;
		int num2 = 35;
		int num3 = 17;
		
		// AND logical operator
		boolean result = (num1 > num2) && (num1 > num3);
		System.out.printf("The result is %b%n",result);
	
		// OR logical operator
		boolean result2 = (num1 > num2) || (num1 > num3);
		System.out.printf("The result is %b%n",result2);
		
		// NOT logical opeartor
		boolean result3 = !(num1 > num2) && (num1 > num3);
		System.out.printf("The result is %b%n",result3);
		
		
		System.out.printf("%nIncreament: %n");
		// Pre-increament unary = BEFORE
		int num4 = 10;
		System.out.printf("%d%n",num4);
		System.out.printf("%d%n",++num4);
		
		// Post-increament unary = AFTER
		int num5 = 10;
		System.out.printf("%d%n",num5);
		System.out.printf("%d%n",num5++);

		System.out.printf("%nDecreament: %n");

		// Pre-decreament unary = BEFORE
		System.out.printf("%d%n",num4);
		System.out.printf("%d%n",--num4);
		
		// Post-decreament unary = AFTER
		System.out.printf("%d%n",num5);
		System.out.printf("%d%n",num5--);		

	}

}
public class HelloWorld{
	public static void main(String[] agrgs){
			
		int num = 50;
		String name = "Jack";
		Float deci = 9.99999F;
		boolean isFun = true;
		char symbol = '$';
		
		
		// using println method
		System.out.println("Hello World, This is my First Java program");
		System.out.println("Learnign java is fun");
		
		//using print method
		System.out.print("The print method should be used to accept input ");
		System.out.print("Another print method \n");
		
		// using printf method
		// %d - for Integer
		// %f - for floating point numbers
		// %s - for string
		// %n - for new line
		// %c - for character
		// %.2f - for floating points
		// %b - for boolean values
		
		System.out.printf("I bought %d qunatity of bread\n",num);
		System.out.printf("My name is %s%n",name);
		System.out.printf("Your balance is %c%.2f%n",symbol,deci);
		System.out.printf("Is Java Fun? %b%n", isFun);
		System.out.printf("Do you enjoy learning \"Java\"");
	}
}
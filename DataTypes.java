public class DataTypes{
	public static void main(String[] args){
		
		// java have two types of data types
		// primitive - store only one vale
		// Reference (non-primitive) - store more than one value
		
		byte myAge = 25;
		short quantity = 25000;
		int nigeriaPopulation = 200000000;
		long worldsPopulation = 67400000000000L;
		float price = 458.31F;
		double balance = 3456927.657657;
		char symbol = '$';
		boolean isJavaFun = true;
		
		System.out.printf("I am %d years old%n", myAge);
		System.out.printf("I ordered %d quantity of phones%n", quantity);
		System.out.printf("The populatipn of nigeria is %d%n", nigeriaPopulation);
		System.out.printf("The words population is %d", worldsPopulation);
		System.out.printf("The price for 2 books is %,2f%n", price);
		System.out.printf("My account balance is %c%.2f%n", symbol, balance);
		System.out.printf("Is Java Fun? %b%n", isJavaFun);
	}
} 
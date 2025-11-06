public class StaticMethod{
	public static void main(String[] args){
		
		addition();
		/* static method
		
			This means when a method belongs to class, u don't need the an object to access the method
		*/
	}
	
	public static void addition(){
		int num1 = 50;
		int num2 = 200;
		int num3 = 7;
		int sum = num1 + num2 + num3;
		
		System.out.printf("The sum is %d%n",sum);
	}
}
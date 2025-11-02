public class Multiplication{
	public static void main(String[] args){
		
		int n = 1;
		int ten = 10;
		int hundred = 100;
		int thousand = 1000;
		System.out.print("N" + " ");
		System.out.print("N*10" + " ");
		System.out.print("N*100" + " ");
		System.out.print("N*1000" + " ");
		
		System.out.println("");
		
		while(n <= 5){
			
			int displayTen = n * ten;
			System.out.print(n + " " + " ");
			System.out.print(displayTen + " " + " ");
			int displayHundred = hundred * n;
			System.out.print(displayHundred + " " + " ");
			int displayThousand = thousand * n;
			System.out.print(displayThousand + " ");
			
			System.out.println("");
			
			n++;
		}
		
	}
	
}
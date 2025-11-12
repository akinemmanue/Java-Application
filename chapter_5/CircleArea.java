import java.util.Scanner;
public class CircleArea{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius = input.nextDouble();
		
		double area = circleArea(radius);
		System.out.println(area);
	}
	
	public static double circleArea(double radius){
		double area = 3.14159 * Math.pow(radius,2);
		return area;
	}
	
	
}
import java.util.Scanner;
public class CircleDemo 
{
	public static void main(String[] args)
	{
		double radius;
		
		Scanner key = new Scanner(System.in);
		Circle border = new Circle();
		
		System.out.println("What is the circle's radius?  ");
		radius = key.nextDouble();
		
		border.setRadius(radius);
		
		System.out.println("Circle's Details");
		System.out.println("Area: " + border.getArea());
		System.out.println("Diameter: " + border.getDiameter());
		System.out.println("Circumference: " + border.getCircumference());
		
	}
	
}

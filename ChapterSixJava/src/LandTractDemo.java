import java.util.Scanner;

public class LandTractDemo 
{
	public static void main(String[] args)
	{
		double length;
		double width;
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("Enter the length of tract 1: ");
		length = key.nextDouble();
		System.out.print("Enter the width of tract 1: ");
		width = key.nextDouble();
		LandTract tractOne = new LandTract(length, width);
		
		System.out.print("Enter the length of tract 2: ");
		length = key.nextDouble();
		System.out.print("Enter the width of tract 2: ");
		width = key.nextDouble();
		LandTract tractTwo = new LandTract(length, width);
		
		System.out.println("Tract One");
		System.out.println(tractOne);
		System.out.println("Tract Two");
		System.out.println(tractTwo);
		
		if(tractOne.getArea() == tractTwo.getArea())
			System.out.println("Tract One and Tract Two are equal in area" );
		else
			System.out.println("Tract one and two are NOT the same size");
	}
}

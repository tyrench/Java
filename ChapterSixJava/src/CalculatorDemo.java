import java.util.Scanner;

public class CalculatorDemo 
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		
		char runAgain;
		int choice;
		int user;
		
		System.out.println("1. Calculate the area of a Triangle");
		System.out.println("2. Calculate the area of a Circle");
		System.out.println("3. Calculate the area of a rectangle");
		System.out.println("4. Quit");
		System.out.println("");
		System.out.print("Enter your choice:  ");
		user = key.nextInt();
		
		if(user < 1 || user > 4)
		{
			System.out.println("ERROR");
			System.out.println("Enter 1,2,3 or 4 (or another wrong answer to end)");
			user = key.nextInt();
		}
		else
		{
			switch(user)
			{
			case 1: tri();
			break;
			case 2: circle();
			break;
			case 3: rectangle();
			break;
			case 4: System.out.print("CYA!");
			}
		}
		
		
	}
	
	public static void tri()
	{
		double base; 
		double height;
		
		Scanner key = new Scanner(System.in);
		System.out.print("Triangle's Base: ");
		base = key.nextDouble();
		System.out.print("Triangle's Height: ");
		height = key.nextDouble();
		
		System.out.println("Triangle's area is: " + Calculator.triArea(base,height));
				
	}
	public static void circle()
	{
		double r;
		Scanner key = new Scanner(System.in);
		System.out.print("What is the circle's radius: ");
		r = key.nextDouble();
		
		System.out.println("Circle's area is: " + Calculator.circleArea(r));
	}
	public static void rectangle()
	{
		double l;
		double w;
		Scanner key = new Scanner(System.in);
		System.out.print("What is the rectangle's width: ");
		w = key.nextDouble();
		System.out.print("What is the rectangle's length: ");
		l = key.nextDouble();
		
		System.out.println("The rectangle's area is: " + Calculator.rectangleArea(l, w));
		
	}
	
}

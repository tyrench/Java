import java.util.Scanner;

public class Bar 
{
	public static void main(String[] args)
	{
		double store1;
		double store2;
		double store3;
		double store4;
		double store5;
		
		
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("Enter today's sales for store 1: ");
		store1 = key.nextDouble();
		System.out.print("Enter today's sales for store 2: ");
		store2 = key.nextDouble();
		System.out.print("Enter today's sales for store 3: ");
		store3 = key.nextDouble();
		System.out.print("Enter today's sales for store 4: ");
		store4 = key.nextDouble();
		System.out.print("Enter today's sales for store 5: ");
		store5 = key.nextDouble();
		
		System.out.println("SALES BAR CHART");
		String bar;
		int stars;
		
		bar = "Store 1: ";
		stars = (int)(store1 / 100);
		for(int i = 0; i < stars; i++)
			bar = bar + "*";
			System.out.println(bar);
		
		bar = "Store 2: ";
		stars = (int)(store2 / 100);
		for(int i = 0; i < stars; i++)
			bar= bar + "*";
			System.out.println(bar);
		
		bar = "Store 3: ";
		stars = (int)store3 / 100;
		for(int i = 0; i < stars; i++)
			bar = bar + "*";
			System.out.println(bar);
		
		bar = "Store 4: ";
		stars = (int)store4 / 100;
		for(int i = 0; i < stars; i++)
			bar = bar + "*";
			System.out.println(bar);
		
		bar = "Store 5: ";
		stars = (int)store5 / 100;
		for(int i = 0; i < stars; i++)
			bar = bar + "*";
			System.out.println(bar);
		
				
	}
}

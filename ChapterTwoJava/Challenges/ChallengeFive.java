import java.util.Scanner;

public class ChallengeFive
{
	public static void main(String[] args)
	{
		int calories = 75;
		int total;
		int cookies;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter how many cookies you have eaten: ");
		cookies = keyboard.nextInt();
		
		total = (calories * cookies);
		
		System.out.println("You have eaten " + total +
							" calories with eating " + cookies + 
							" cookies.");
		
	}
}
import java.util.Scanner;
public class RouletteDemo 
{
	public static void main(String[] args)
	{
		int number;
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Welcome to Roulette Wheel Colors!");
		System.out.println("Enter a number between 0 and 36: ");
		number = key.nextInt();
		
		if(number < 0 || number > 36)
		{
			System.out.println("Error, a number between ZERO and THIRTY-SIX");
		}
		else
		{
			Roulette r = new Roulette(number);
			System.out.println(r.getColor());
		}
	}
}

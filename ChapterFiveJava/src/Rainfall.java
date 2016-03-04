
import java.util.Scanner;

public class Rainfall 
{
	public static void main(String[] args)
	{
		int months = 12;
		int years;
		double monthlyRain;
		double totalRain = 0;
		double average;
		double totalMonths;
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("How many years do you wanna calcuate the rain fall?  ");
		years = key.nextInt();
		while (years < 1)
		{
			System.out.println("Enter 1 or greater for the amount of years: ");
			years = key.nextInt();
		}
		
		System.out.println("Rainfall in inches for each month(each month in inches)");
		for (int x = 1; x <= years; x++)
		{
			for(int y = 1; y <= months; y++)
			{
				System.out.print("Year " + x + " month " + y + ":");
				monthlyRain = key.nextInt();
				while(monthlyRain < 0)
				{
					System.out.print("Enter a number 0 or larger for rain fall: ");
					monthlyRain=key.nextDouble();
				}
				totalRain += monthlyRain;
			}
		}
		totalMonths = months * years;
		average = totalRain / (months * years);
		
		System.out.println("In " + years + " year(s) (" + totalMonths + " months), we had " + totalRain + " inches of rain.");
		System.out.println("An average rainfall of " + average + " inches per month");
	}
}

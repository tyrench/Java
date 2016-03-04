import java.util.Scanner;
import java.text.DecimalFormat;

public class Pennies 
{
	public static void main(String[] args)
	{
		int day = 1;
		int total = 0;
		int timeWorked;
		int pennies = 1;
		Scanner key = new Scanner(System.in);
		
		System.out.println("How many days did you work?");
		timeWorked = key.nextInt();
		while(timeWorked < 1)
		{
			System.out.println("How many days did you work? (greater than zero)");
			timeWorked = key.nextInt();
		}
		
		System.out.println("Days \t Pennies");
		while(day <= timeWorked)
		{
			System.out.println(day + "\t" + pennies);
			total += pennies;
			
			day++;
			
			pennies *= 2;
		}
		DecimalFormat decimal = new DecimalFormat("#,##0.00");
		System.out.println("Total: $" + decimal.format(total / 100.0));
		

	}
}

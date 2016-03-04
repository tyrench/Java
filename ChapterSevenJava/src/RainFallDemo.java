import java.util.Scanner;

public class RainFallDemo 
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		
		int rainFall = 12;
		double[] rainYear = new double[rainFall];
		
		System.out.println("Enter the month's rain in inches");
		System.out.println("(starting with January through December");
		
		for(int i = 0; i < rainFall; i++)
		{
			System.out.print("Enter rainfall: ");
			rainYear[i] = key.nextDouble();
			if(rainYear[i] < 0)
			{ 
				System.out.println("Error: You cannot get a negative amount of rain...");
				System.out.print("Please enter again: ");
				rainYear[i] = key.nextDouble();
			}
		}
		
		RainFall rain = new RainFall(rainYear);
		
		System.out.println("Total Rainfall: "+ rain.getTotalRain());
		System.out.println("Average Rainfall: " + rain.averageRainFaill());
		System.out.println("Highest Rainfall: " + rain.getHighestRainFall());
		System.out.println("Lowest Rainfall: " + rain.getLowestRainFall());
	}
}


import java.util.Scanner;
public class PopulationDemo 
{
	public static void main(String[] args)
	{
		int population;
		int dailyIncrease;
		int days;
		int totalPop = 0;
		Scanner key = new Scanner(System.in);
		
		
		System.out.println("How many people live in your city? ");
		population = key.nextInt();
		while(population < 2)
		{
			System.out.println("Cannot be you and one other peorson, cave people.");
			System.out.println("Enter your population over two: ");
			population = key.nextInt();
		}
		
		System.out.println("What is your average daily incrase? (in people): ");
		dailyIncrease = key.nextInt();
		while(dailyIncrease < 0)
		{
			System.out.println("You cannot be losing people, enter again: ");
			dailyIncrease = key.nextInt();
		}
		
		System.out.println("How many days are you going to increase in size? ");
		days = key.nextInt();
		while(days < 1)
		{
			System.out.println("You aren't gaining anyone? ");
			System.out.println("Please try again with a number greater than 0: ");
			days = key.nextInt();
		}
		System.out.println("Day \t New population size");
		int start = 1;
		while (start <= days)
		{
			Population pop = new Population(population, dailyIncrease, start);
			
			System.out.println(start + "\t\t" + pop.getTotalPopulation());
			
			start++;
		}
		
		
		
	}
}

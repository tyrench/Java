import java.util.Scanner;

public class FatGramDemo 
{
	public static void main(String[] args)
	{
		double cals;
		double fatGrams;
		double fatPercentage;
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("How many calories does your food have? ");
		cals = key.nextDouble();
		
		System.out.println("How many grams of fat does your food have? ");
		fatGrams = key.nextDouble();
		
		FatGram f = new FatGram(fatGrams, cals);
		
		if(f.getFatCalories() > f.getCalories())
		{
			System.out.println("Cannot compute, try again.. ");
		}
		else
		{
			fatPercentage = f.getFatPercentage();
			System.out.println("The percentage of calories from fat is " + (fatPercentage * 100) + "%");
			if(fatPercentage < 0.3)
			{
				System.out.println("This food is low in fat!" );
			}
			else
			{
				System.out.println("This food is not low in fat");
			}
		}
	}
}

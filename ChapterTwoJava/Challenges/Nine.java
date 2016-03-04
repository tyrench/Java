import java.util.Scanner;
public class Nine
{
	public static void main(String[] args)
	{
		int milesDriven;
		int gallonsUsed;
		double mpg;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter how many miles you drove:  ");
		milesDriven = keyboard.nextInt();
		System.out.print("Enter how many gallons you used:  ");
		gallonsUsed = keyboard.nextInt();
		
		mpg = (double)milesDriven / gallonsUsed;
		
		System.out.printf("Your miles per gallon is: %.2f", mpg);
		
	}
}
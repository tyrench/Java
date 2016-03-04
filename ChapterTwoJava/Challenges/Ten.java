import java.util.Scanner;
public class Ten
{
	public static void main(String[] args)
	{
		double testOne;
		double testTwo;
		double testThree;
		double average;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the first test: ");
		testOne = keyboard.nextDouble();
		System.out.print("Enter the second test: ");
		testTwo = keyboard.nextDouble();
		System.out.print("Enter the final test:  ");
		testThree = keyboard.nextDouble();
		
		average = (testOne + testTwo + testThree) / 3;
		
		System.out.printf("You're average for the tests are %.2f", average);
		System.out.print("%");
	}
}
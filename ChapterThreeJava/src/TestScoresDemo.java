import java.util.Scanner;
public class TestScoresDemo 
{
	public static void main(String[] args)
	{
		double testOne;
		double testTwo;
		double testThree;
		Scanner key = new Scanner(System.in);
		TestScores test = new TestScores();
		
		System.out.println("What is the first test? ");
		testOne = key.nextDouble();
		
		System.out.println("What is the second test? ");
		testTwo = key.nextDouble();
		
		System.out.println("What is the final test? ");
		testThree = key.nextDouble();
		
		test.setTestOne(testOne);
		test.setTestTwo(testTwo);
		test.setTestThree(testThree);
		
		System.out.printf("The average for the three test are %.2f percent", test.getTestAverage());
	}
}

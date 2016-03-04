import java.util.Scanner;
public class TestScoresDemo 
{
	public static void main(String[] args)
	{
		double testOne;
		double testTwo;
		double testThree;
		double total;
		double average; 
		
		Scanner key = new Scanner(System.in);
		TestScores test = new TestScores();
		
		System.out.println("What is the score of test 1? ");
		testOne = key.nextDouble();
		System.out.println("What is the score of test 2? ");
		testTwo = key.nextDouble();
		System.out.println("What is the score of test 3? ");
		testThree = key.nextDouble();
		
		test.setTestTwo(testTwo);
		test.setTestThree(testThree);
		test.setTestOne(testOne);
		
		if(testOne >= 90)
		{
			System.out.println("You have an A on test one" );
		}
		else if(testOne >= 80 )
		{
			System.out.println("You have a B on test one");
		}
		else if(testOne >= 70)
		{
			System.out.println("You have a C on test one");
		}
		else if(testOne >= 60)
		{
			System.out.println("You have a D on test one");
		}
		else if(testOne < 60)
		{
			System.out.println("You Failed test one");
		}
		
		if(testTwo >= 90)
		{
			System.out.println("You have an A on test two" );
		}
		else if(testTwo >= 80 )
		{
			System.out.println("You have a B on test two");
		}
		else if(testTwo >= 70)
		{
			System.out.println("You have a C on test two");
		}
		else if(testTwo >= 60)
		{
			System.out.println("You have a D on test two");
		}
		else if(testTwo < 60)
		{
			System.out.println("You Failed test two");
		}
		
		if(testThree >= 90)
		{
			System.out.println("You have an A on test three" );
		}
		else if(testThree >= 80 )
		{
			System.out.println("You have a B on test three");
		}
		else if(testThree >= 70)
		{
			System.out.println("You have a C on test three");
		}
		else if(testThree >= 60)
		{
			System.out.println("You have a D on test three");
		}
		else if(testThree < 60)
		{
			System.out.println("You Failed test three");
		}
		
		if(test.getTestAverage() >= 90)
		{
			System.out.println("The average for the three test is an A! ");
		}
		else if(test.getTestAverage() >= 80)
		{
			System.out.println("The average for the three test is an B! ");
		}
		else if(test.getTestAverage() >= 70)
		{
			System.out.println("The average for the three test is an C! ");
		}
		else if(test.getTestAverage() >= 60)
		{
			System.out.println("The average for the three test is an D! ");
		}
		else if(test.getTestAverage() < 60)
		{
			System.out.println("The average for the three test is a Failing grade... ");
		}
	}
}


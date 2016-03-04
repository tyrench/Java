import java.util.Scanner;

public class TestScoresDemo {

	public static void main(String[] args)
	{
		int scores = 5;
		double[] testScores = new double[scores];
		Scanner key = new Scanner(System.in);
		
		for(int i = 0; i >= testScores[i]; i++)
		{
			System.out.println("Enter Test Score " + (i + 1) + ":");
			testScores[i] = key.nextDouble();
			if(i < 0 || i > 101)
			{
				System.out.print("Error: Test cannot be over 100 or under 0. \n Enter again: " );
				testScores[i] = key.nextDouble();
			}
		}
		
		try
		{
			TestScores test = new TestScores(testScores);
			System.out.println("The average is: " + test.getAverage());
		}
		catch(InvalidTestScore i)
		{
			System.out.println(i.getMessage() + " Invalid Score");
		}
	}

}

import java.text.DecimalFormat;

public class TestScoresDemoTwo 
{
	public static void main(String[] args)
	{
		//exception array
		double[] wrongScore = {71.6, 103.1, -3.96, 95.9, 65.5};
		//accetable array
		double[] goodScore = {89.9, 93.2, 75.5, 14, 99.3};
		DecimalFormat dollar = new DecimalFormat("##0.00");
		//testing the wrong score of an array (SHOULD ERROR OUT)
		try
		{
			TestScores wrong = new TestScores(wrongScore);
			System.out.print("Avgerage Scores: " + dollar.format(wrong.getAverage()) + " %");
		}
		catch(InvalidTestScore i)
		{
			System.out.println(i.getMessage() + " is an invalid Score ");
		}
		//testing the correct score of an array
		try
		{
			TestScores good = new TestScores(goodScore);
			System.out.print("Average Scores: " + dollar.format(good.getAverage()) + "%");
		}
		catch (InvalidTestScore i)
		{
			System.out.print(i.getMessage() + " Invalid");
		}

	}

}

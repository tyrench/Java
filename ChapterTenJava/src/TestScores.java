
public class TestScores 
{
	private double[] scores;
	
	public TestScores(double[] s) throws InvalidTestScore
	{
		//set scores length to be able to be accaptable as the length of s
		scores = new double[s.length];
		
		//for loop to get test scores (valid or invalid)
		for(int i = 0; i < s.length; i++)
		{
			if(s[i] < 0 || s[i] > 100)
				throw new InvalidTestScore(i, s[i]);
			else
				scores[i] = s[i];
		}
	}
	
	public double getAverage()
	{
		double total = 0.0;
		
		for(int i = 0; i < scores.length; i++)
			total += scores[i];
		
		return(total / scores.length);
	}
}

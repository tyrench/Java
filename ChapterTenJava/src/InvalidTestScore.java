
public class InvalidTestScore extends Exception
{
	public InvalidTestScore()
	{
		super("Test Score does not compute");
	}
	
	public InvalidTestScore(int i, double s)
	{
		super("Test " + (i + 1) + " Invalid Score: " + s);
	}
}

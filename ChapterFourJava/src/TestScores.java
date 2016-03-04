
public class TestScores 
{
	private double testOne;
	private double testTwo;
	private double testThree;
	private double average;
	
	public TestScores()
	{
		testOne = 0;
		testTwo = 0;
		testThree = 0;
	}
	
	public TestScores(double one1, double two2, double three3)
	{
		testOne = one1;
		testTwo = two2;
		testThree = three3;
	}
	
	public void setTestOne(double one)
	{
		testOne = one;
	}
	public void setTestTwo(double two)
	{
		testTwo = two;
	}
	public void setTestThree(double three)
	{
		testThree = three;
	}
	
	public double getTestAverage()
	{
		average = (testOne + testTwo + testThree) / 3.0;
		return average;
	}
	
}

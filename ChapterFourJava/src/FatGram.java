
public class FatGram 
{
	private double calories;
	private double fatGrams;
	
	
	public FatGram(double f, double c)
	{
		fatGrams = f;
		calories = c;
	}
	
	public void setCalories(double c)
	{
		calories = c;
	}
	public void setFatGrams(double f)
	{
		fatGrams = f;
	}
	
	public double getCalories()
	{
		return calories;
	}
	public double getFatGrams()
	{
		return fatGrams;
	}
	
	public double getFatCalories()
	{
		return fatGrams * 9;
	}
	public double getFatPercentage()
	{
		double fatCalories;
		double percentage;
		
		fatCalories = fatGrams * 9;
		percentage = fatCalories / calories;
		
		return percentage;
	}

}


public class Widget 
{
	private double widgetsPerHour = 10.0;
	private int shifts = 2;
	private int hoursPerShift = 8;
	private int numWidgets;
	
	public void setNumWidgets(int n)
	{
		numWidgets = n;
	}
	public int getNumWidgets()
	{
		return numWidgets;
	}
	
	public double getDaysToProduce()
	{
		double widgetsPerDay = widgetsPerHour * shifts * hoursPerShift;
		
		return numWidgets / widgetsPerDay;
	}
}

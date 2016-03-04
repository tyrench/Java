//three
public class Payroll 
{
	private String name;
	private int idNum;
	private double hourlyRate;
	private double hoursWorked;
	private double rate;
	
	public Payroll()
	{
		name = "";
		idNum = 0;
		hourlyRate = 0.0;
		hoursWorked = 0.0;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	public void setIdNum(int id)
	{
		idNum = id;
	}
	public void setHourlyRate(double rate)
	{
		hourlyRate = rate;
	}
	public void setHoursWorked(double hours)
	{
		hoursWorked = hours;
	}
	
	public double getRate()
	{
		rate = hourlyRate * hoursWorked;
		return rate;
	}
	
}

//ten48
package Payroll;

public class Payroll 
{
	private String name;
	private int idNum;
	private double hourlyRate;
	private double hoursWorked;
	private double rate;
	
	public Payroll() throws Exception
	{
		if(name == "")
		{
			throw new Exception("Employee has to have a name");
		}
		name = "";
		idNum = 0;
		hourlyRate = 0.0;
		hoursWorked = 0.0;
	}
	
	public void setName(String n) throws EmptyString
	{
		if(n != null)
			name = n;
		else
			throw new EmptyString();
			
	}
	public void setIdNum(int id) throws idNumException
	{
		if(id <= 0)
		{
			throw new idNumException(id);
		}
		else
			idNum = id;
	}
	public void setHourlyRate(double rate) throws HourlyRateException
	{
		if(rate < 0 || rate >= 25)
			throw new HourlyRateException(rate);
		else
			hourlyRate = rate;
	}
	public void setHoursWorked(double hours) throws HoursWorkedException
	{
		if(hours < 0 || hours >= 84)
			throw new HoursWorkedException(hours);
		else	
			hoursWorked = hours;
	}
	
	public String getName()
	{
		return name;
	}
	public int getIDNum()
	{
		return idNum;
	}
	public double getHoursWorked()
	{
		return hoursWorked;
	}
	public double getHourlyRate()
	{
		return hourlyRate;
	}
	public double getRate()
	{
		return rate;
	}
	public double getGrossPay()
	{
		double grossRate = hourlyRate * hoursWorked;
		return grossRate;
	}
}

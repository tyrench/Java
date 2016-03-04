package Payroll;

public class HourlyRateException extends Exception
{
	public HourlyRateException()
	{
		super("Cannot accept that number");
	}
	public HourlyRateException(double hours)
	{
		super("Cannt accept " + hours + " as hours worked");
	}
}

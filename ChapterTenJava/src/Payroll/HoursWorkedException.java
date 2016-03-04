package Payroll;

public class HoursWorkedException extends Exception
{
	public HoursWorkedException()
	{
		super("Cannot accept that number");
	}
	public HoursWorkedException(double worked)
	{
		super("Cannot accept " + worked + " for amount of worked hours");
	}
}

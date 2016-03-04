package Retail;

public class NegativeUnits extends Exception
{
	public NegativeUnits()
	{
		super("A negative number cannot be given for units");
	}
	public NegativeUnits(double units)
	{
		super(units + " cannot be accpted");
	}
}

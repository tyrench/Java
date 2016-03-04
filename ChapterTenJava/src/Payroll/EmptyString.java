package Payroll;

public class EmptyString extends Exception
{
	public EmptyString()
	{
		super("Cannot accept an empty line");
	}
	public EmptyString(String name)
	{
		super("Cannot accept an empty name");
	}
}

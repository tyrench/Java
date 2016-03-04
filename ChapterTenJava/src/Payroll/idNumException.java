package Payroll;

public class idNumException extends Exception
{
	public idNumException()
	{
		super("Cannot be blank for employee's ID number");
	}
	public idNumException(int id)
	{
		super("Cannot not accept negative numbers");
	}
}

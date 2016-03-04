package Retail;

public class NegativeNumber extends Exception
{
	public NegativeNumber()
	{
		super("You have to enter a number");
	}
	public NegativeNumber(double price)
	{
		super("Negative number: " + price + " cannot be accpted");
	}
}

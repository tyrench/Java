package Retail;

public class CashRegister 
{
	private double tax = .06;
	private double items;
	private double quanitiy;
	
	public CashRegister(Retail item, int quant)
	{
		items = item.getRetail();
		quanitiy = quant;
	}
	
	public double getSubtotal()
	{
		return items * quanitiy;
	}
	
	public double getTax()
	{
		return getSubtotal() * tax;
	}
	
	public double getTotal()
	{
		return getSubtotal() + getTax();
	}
	
	
}

package Retail;

public class RetailItem 
{
	private String description;
	private int unitsOnHand;
	private double price;
	
	
	public void setDescription(String des)
	{
		description = des;
	}
	public void setUnitsOnHand(int units)throws NegativeUnits
	{
		if(units < 0)
		{
			throw new NegativeUnits(units); 
		}
		else
			unitsOnHand = units;
	}
	public void setPrice(double p)throws NegativeNumber
	{
		if(p < 0)
		{
			throw new NegativeNumber(p);
		}
		else
			price = p;
	}
	
	public String getDescription()
	{
		return description;
	}
	public int getUnitsOnHand()
	{
		return unitsOnHand;
	}
	public double getPrice()
	{
		return price;
	}
	
	
	
}

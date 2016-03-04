
public class RetailItem 
{
	private String description;
	private int unitsOnHand;
	private double price;
	
	
	public RetailItem()
	{
		description = "";
		unitsOnHand = 0;
		price = 0.0;
	}
	
	public RetailItem(String des, int units, double p)
	{
		description = des;
		unitsOnHand = units;
		price = p;
	}
	
	public void setDescription(String des)
	{
		description = des;
	}
	public void setUnitsOnHand(int units)
	{
		unitsOnHand = units;
	}
	public void setPrice(double p)
	{
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

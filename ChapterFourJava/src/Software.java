public class Software 
{
	private double price = 99.0;
	private int unitsSold;
	double discPercent;
	double discount;
	
	public Software(int s)
	{
		unitsSold = s;
	}
	public int getUnitSold()
	{
		return unitsSold;
	}
	
	public double getDiscount()
	{
		if(unitsSold >= 100)
		{
			discPercent = 0.5;
		}
		else if(unitsSold >= 50)
		{
			discPercent = 0.4;
		}
		else if(unitsSold >= 20)
		{
			discPercent = 0.3;
		}
		else if(unitsSold >= 10)
		{
			discPercent = 0.2;
		}
		else
		{
			discPercent = 0.0;
		}
		discount = (unitsSold * price) * discPercent;
		return discount;
	}
	
	public double getCost()
	{
		double cost;
		cost = (unitsSold * price) - getDiscount();
		return cost;
	}
	
}
	

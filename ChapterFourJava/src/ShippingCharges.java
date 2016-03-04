
public class ShippingCharges 
{
	private double kilograms;
	private double miles;
	

	public ShippingCharges(double k, double m)
	{
		kilograms = k;
		miles = m;
	}
	
	public void setKilograms(double k)
	{
		kilograms = k;
	}
	public void setMiles(double m)
	{
		miles = m;
	}
	
	public double getKilograms()
	{
		return kilograms;
	}
	public double getMiles()
	{
		return miles;
	}
	
	
	public double getShippingCharges()
	{
		double rate;
		double numOfMiles;
		double price;
		
		numOfMiles = miles / 500;
		
		if(numOfMiles == 0)
			numOfMiles = 1;
		
		
		if(kilograms > 10)
		{
			rate = 4.80;
		}
		else if(kilograms > 6)
		{
			rate = 3.70;
		}
		else if(kilograms > 2)
		{
			rate = 2.20;
		}
		else
		{
			rate = 1.10;
		}
		
		price =  rate * numOfMiles;
		return price;
	}
	
}

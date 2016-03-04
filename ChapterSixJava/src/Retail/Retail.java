package Retail;
import java.text.DecimalFormat;

public class Retail 
{
	private String description;
	private int itemNumber;
	private CostData cost;
	
	
	public Retail(String desc, int itemNum, double wholesale, double retail)
	{
		description = desc;
		itemNumber = itemNum;
		cost = new CostData(wholesale, retail);
	}
	
	public void setWholeSale(double w)
	{cost.wholesale = w; }
	public double getWholeSale()
	{return cost.wholesale;}
	public void setRetail(double r)
	{cost.retail = r; }
	public double getRetail()
	{return cost.retail;}

	public String toString()
	{
		String str;
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		
		str = "Description: " + description
				+ "\n Item Number: " + itemNumber
				+ "\n WholeSale Cost: " + dollar.format(cost.wholesale)
				+ "\n Retail Price: " + dollar.format(cost.retail);
		return str;
	}
	private class CostData
	{
		public double wholesale;
		public double retail;
		
		public CostData(double w, double r)
		{
			wholesale = w;
			retail = r;
		}
	}
	
}

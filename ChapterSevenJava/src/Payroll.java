
public class Payroll 
{
	int seven = 7;
	private int[] employeeID = { 565884, 4520125, 7895112, 8777541, 9451277, 13302850, 7580489 };
	private double[] hours = new double[seven];
	private double[] payRate = new double[seven];
	private double[] wages = new double[seven];
	
	public void setEmployeeID(int i, int id)
	{
	 employeeID[i] = id;
	}
	public int getEmployeeID(int i)
	{
		return employeeID[i];
	}
	
	public void setHours(int i, double hours2)
	{
		hours[i] = hours2;
	}
	public double getHours(int i)
	{
		return hours[i];
	}
	
	public void setPayRate(int i, double p)
	{
		payRate[i] = p;
	}
	public double getPayRate(int i)
	{
		return payRate[i];
	}
	
	public void setWages(int i, double w)
	{
		wages[i] = w;
	}
	public double getWages(int i)
	{
		return wages[i];
	}
	
	
	public double getPay(int i)
	{
		return payRate[i] * hours[i];
	}
	
}

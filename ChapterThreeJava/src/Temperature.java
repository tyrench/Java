
public class Temperature 
{
	private double ftemp;
	private double celsius;
	private double kelvin;
	
	public Temperature()
	{
		ftemp = 0;
		celsius = 0;
		kelvin = 0;
	}
	
	public Temperature(double f, double c, double k)
	{
		ftemp = f;
		celsius = c;
		kelvin = k;
	}
	
	public void setFtemp(double f)
	{
		ftemp = f;
	}
	
	public double getFtemp()
	{
		return ftemp;
	}
	public double getCelsius()
	{
		celsius = (5.0/9.0) * (ftemp - 32);
		return celsius;
	}
	public double getKelvin()
	{
		kelvin = ((5.0/9.0) * (ftemp - 32.0)) + 273.0; 
		return kelvin;
	}
	
	
	
}

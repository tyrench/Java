
public class Speed 
{
	double time;
	double distance;
	String input;
	double air = 1100;
	double water = 4900;
	double steel = 16400;
	
	public Speed(String i, double d)
	{
		input = i;
		distance = d;
	}
	public void setTime(double t)
	{
		time = t;
	}
	public void setDistance(double d)
	{
		distance = d;
	}
	
	
	public double getSpeedInAir()
	{
		time = distance / air;
		return time;
	}
	public double getSpeedInWater()
	{
		time = distance / water;
		return time;
	}
	public double getSpeedInSteel()
	{
		time = distance / steel;
		return time;
	}

}

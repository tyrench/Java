import java.util.Scanner;

public class RainFall 
{
	private double[] rain;
	
	public RainFall(double[] r)
	{
		rain = new double[r.length];
		
		for(int i = 0; i < r.length; i++)
		{
			rain[i] = r[i];
		}
	}
	
	public double getTotalRain()
	{
		double total = 0.0;
		for(int i = 0; i < rain.length; i++)
		{
			total += rain[i];
		}
		return total;
	}
	
	public double averageRainFaill()
	{
		double averageRain = getTotalRain() / rain.length;
		return averageRain;
	}
	
	public double getHighestRainFall()
	{
		double high = rain[0];
		for(int i = 1; i < rain.length; i++)
		{
			if(rain[i] > high)
			{high = rain[i];}
		}
		return high;
	}
	
	public double getLowestRainFall()
	{
		double lowest = rain[0];
		for(int i = 1; i < rain.length; i++)
		{
			if(rain[i] < lowest)
				lowest = rain[i];
		}
		return lowest;
	}
	
	public double getRain(int i)
	{
		return rain[i];
	}
}

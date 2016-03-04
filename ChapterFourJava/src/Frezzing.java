public class Frezzing 
{
	private double temp;
	
	public Frezzing(double t)
	{
		temp = t;
	}
	
	public void setTemp(double t)
	{
		temp = t;
	}
	
	public double getTemp()
	{
		return temp;
	}
	
	public boolean isEthylFreezing()
	{
		boolean hold;
		
		if(temp <= -173)
			hold = true;
		else 
			hold = false;
		
		return hold;
	}
	public boolean isEthylBoiling()
	{
		boolean hold;
		
		if(temp >= 172)
			hold = true;
		else 
			hold = false;
		
		return hold;
	}
	public boolean isOxygenFreezing()
	{
		boolean hold;
		
		if(temp <= -362)
			hold = true;
		else 
			hold = false;
		
		return hold;
	}
	public boolean isOxygenBoiling()
	{
		boolean hold;
		
		if(temp >= -306)
			hold = true;
		else 
			hold = false;
		
		return hold;	
	}
	public boolean isWaterFreezing()
	{
		boolean hold;
		
		if(temp <= 32)
			hold = true;
		else 
			hold = false;
		
		return hold;
	}
	public boolean isWaterBoiling()
	{
		boolean hold;
		
		if(temp >= 212)
			hold = true;
		else 
			hold = false;
		
		return hold;
	}

	
}
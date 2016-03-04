public class Roulette 
{
	int number;
	String color;
	
	public Roulette(int n)
	{
		number = n;
		
		if(number >= 1 && number <= 10)
		{
			if(number % 2 == 0)
			{
				color = "Black";
				
			}
			else 
			{
				color = "Red";
			}
		}
		else if(number >= 11 && number <= 18)
		{
			if(number % 2 == 0)
			{
				color = "Red";
			}
			else
			{
				color = "Black";
			}
		}
		else if(number >= 19 && number <= 28)
		{
			if (number % 2 == 0)
			{
				color = "Black";
			}
			else
			{
				color = "Red";
			}
		}
		else if(number >= 29 && number <= 36)
		{
			if(number % 2 == 0)
			{
				color = "Red";
			}
			else
			{
				color = "Black";
			}
		}
		else
		{
			color = "Green";
		}
	}
	public String getColor()
	{
		return color;
	}
}

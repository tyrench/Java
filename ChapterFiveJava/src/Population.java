
public class Population 
{
	int population;
	int dailyIncrease;
	int days;
	int totalPop;
	
	public Population(int pop, int increase, int d)
	{
		population = pop;
		dailyIncrease = increase;
		days = d;
	}

	public void setPopulation(int population) 
	{
		this.population = population;
	}

	public void setDailyIncrease(int dailyIncrease) 
	{
		this.dailyIncrease = dailyIncrease;
	}

	public void setDays(int days) 
	{
		this.days = days;
	}
	
	public int getTotalPopulation()
	{
		totalPop = population + (dailyIncrease * days);
		return totalPop;
	}
	
 
}


public class Runners 
{
	private String runner1;
	private String runner2;
	private String runner3;
	private double time1;
	private double time2;
	private double time3;
	
	public void setRunner1(String one)
	{
		runner1 = one;
	}
	public void setRunner2(String two)
	{
		runner2 = two;
	}
	public void setRunner3(String three)
	{
		runner3 = three;
	}
	
	public void setTime1(double one)
	{
		time1 = one;
	}
	public void setTime2(double two)
	{
		time2 = two;
	}
	public void setTime3(double three)
	{
		time3 = three;
	}
	
	public String getRunner1()
	{
		return runner1;
	}
	public String getRunner2()
	{
		return runner2;
	}
	public String getRunner3()
	{
		return runner3;
	}
	
	public double getTime1()
	{
		return time1;
	}
	public double getTime2()
	{
		return time2;
	}
	public double getTime3()
	{
		return time3;
	}
	
	
	public String getFirstPlace()
	{
		String firstPlace;
		
		if(time1 < time2 && time1 < time3)
			firstPlace = runner1;
		else if(time2 < time1 && time2 < time3)
		{
			firstPlace = runner2;
		}
		else
			firstPlace = runner3;
		
		return firstPlace;
	}
	
	public String getSecondPlace()
	{
		String secondPlace;
		if(time1 < time2 && time1 > time3)
			secondPlace = runner1;
		else if(time1 < time3 && time1 > time2 )
			secondPlace = runner1;
		else if(time2 < time1 && time2 > time3)
			secondPlace = runner2;
		else if(time2 < time3 && time2 > time1)
			secondPlace = runner2;
		else
			secondPlace = runner3;
			
		return secondPlace;
	}
	
	public String getThirdPlace()
	{
		String thirdPlace;
		if(time1 > time2 && time1 > time3)
			thirdPlace = runner1;
		else if(time2 > time1 && time2 > time3)
			thirdPlace = runner2;
		else 
			thirdPlace = runner3;
		
		return thirdPlace;
	}
}

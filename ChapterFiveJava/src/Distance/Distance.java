package Distance;

public class Distance 
{
	int time;
	int speed;
	public Distance(int s, int t)
	{
		time = t;
		speed = s;
	}
	public void setTime(int t)
	{
		time = t;
	}
	public void setSpeed(int s)
	{
		speed = s;
	}
	
	
	public int getDistance()
	{
		int distance = 1;
		
		distance = speed * time;
		
		return distance;
	}
}

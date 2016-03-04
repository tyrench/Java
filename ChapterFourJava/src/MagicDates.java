
public class MagicDates 
{
	private int day;
	private int month;
	private int year;
	
	public MagicDates(int d, int m, int y)
	{
		day = d;
		month = m;
		year = y;
	}
	
	public boolean isMagic()
	{
		boolean magic = false;
		
		if((month * day) == year)
		{
			magic = true;
		}
		
		return magic;
	}
}

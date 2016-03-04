package Month;

public class Month 
{
	private int monthNumber;
	
	public Month()
	{
		monthNumber = 1;
	}
	
	public Month(int month)
	{
		if(month < 1 || month > 12)
		{
			monthNumber = 1;
		}
		else
		{
			monthNumber = month;
		}
	}
	
	public Month(String monthName)
	{
		if(monthName.equalsIgnoreCase("january"))
		{monthNumber = 1;}
		else if(monthName.equalsIgnoreCase("february"))
		{monthNumber = 2;}
		else if(monthName.equalsIgnoreCase("march"))
		{monthNumber = 3;}
		else if(monthName.equalsIgnoreCase("april"))
		{monthNumber = 4;}
		else if(monthName.equalsIgnoreCase("may"))
		{monthNumber = 5;}
		else if(monthName.equalsIgnoreCase("june"))
		{monthNumber = 6;}
		else if(monthName.equalsIgnoreCase("july"))
		{monthNumber = 7;}
		else if(monthName.equalsIgnoreCase("august"))
		{monthNumber = 8;}
		else if(monthName.equalsIgnoreCase("september"))
		{monthNumber = 9;}
		else if(monthName.equalsIgnoreCase("october"))
		{monthNumber = 10;}
		else if(monthName.equalsIgnoreCase("november"))
		{monthNumber = 11;}
		else if(monthName.equalsIgnoreCase("december"))
		{monthNumber = 12;}
	}
	
	public void setMonthNumber(int month)
	{
		if(month < 1 || month > 12)
		{
			monthNumber = 1;
		}
		else
			monthNumber = month;
	}
	
	public int getMonthNumber()
	{
		return monthNumber;
	}
	
	public String getMonthsName()
	{
		String month;
		switch(monthNumber)
		{
		case 1: month = "January";
		break;
		case 2: month = "February";
		break;
		case 3: month = "March";
		break;
		case 4: month = "April";
		break;
		case 5: month = "May";
		break;
		case 6: month = "June";
		break;
		case 7: month = "July";
		break;
		case 8: month = "August";
		break;
		case 9: month = "Septemeber";
		break;
		case 10: month = "October";
		break;
		case 11: month = "November";
		break;
		case 12: month = "December";
		break;
		default: month = "Error on the play";
		}
		return month;	
	}
	
	public String toString()
	{return getMonthsName();}
	
	public boolean equals(Month monthTwo)
	{
		boolean is;
		if(monthTwo.getMonthNumber() == monthNumber)
			is = true;
		else
			is = false;
		return is;
	}
	
	public boolean greatThan(Month monthTwo)
	{
		boolean is;
		if(monthNumber > monthTwo.getMonthNumber())
			is = true;
		else
			is = false;
			return is;
	}
	
	public boolean lessThan(Month monthTwo)
	{
		boolean is;
		if(monthNumber < monthTwo.getMonthNumber())
			is = true;
		else
			is = false;
		return is;
	}
	
	
	
}

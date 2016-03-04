import java.util.Scanner;
public class MagicDatesDemo 
{
	public static void main(String[] args)
	{
		int month;
		int day;
		int year;
		
		Scanner key = new Scanner(System.in);
		System.out.println("Enter the number of a day:  " );
		day = key.nextInt();
		System.out.println("Enter the number of month:  ");
		month = key.nextInt();
		System.out.println("Enter the number of a year:  ");
		year = key.nextInt();
		
		MagicDates date = new MagicDates(day, month, year);
		
		if(date.isMagic())
		{
			System.out.println("That date is magic! ");
		}
		else
		{
			System.out.println("Just a regular day folks... not magic");
		}
	}
}

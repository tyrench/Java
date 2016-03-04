import java.util.Scanner;
public class Time 
{
	public static void main(String[] args)
	{
		int seconds;
		int time;
		
		Scanner key = new Scanner(System.in);
		System.out.println("Enter an amount of seconds:  " );
		seconds = key.nextInt();
		
		if(seconds > 84600)
		{
			time = seconds / 84600;
			System.out.println("You would have " + time + " day(s) in this many seconds " + seconds);
		}
		else if(seconds > 3600)
		{
			time = seconds / 3600;
			System.out.println("You would have " + time + " hour(s) in this many seonds " + seconds);
		}
		else if(seconds >= 60)
		{
			time = seconds / 60;
			System.out.println("You would have " + time + " minute(s) in " + seconds);
		}
		else if(seconds < 60)
		{
			System.out.println("That is less than a mintue, please enter something larger. ");
		}



		
		
	}
}

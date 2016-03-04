import java.util.Scanner;
public class BookClub 
{
	public static void main(String[] args)
	{
		int books;
		int points;
		
		Scanner key = new Scanner(System.in);
		System.out.println("How many books have you purcased? " );
		books = key.nextInt();
		
		if (books < 1)
			points = 0;
		else if(books == 1)
			points = 5;
		else if(books == 2)
			points = 15;
		else if(books == 3)
			points = 30;
		else
			points = 60;
		
		System.out.println("You've earned " + points + " points");
	}
}

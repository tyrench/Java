import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class CharageAccountDemo 
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int[] charge = {5658845, 4520125, 7895122, 877541, 8451277, 1302850, 8080152, 
						4562555, 5552012, 5050552, 7825877, 1250255, 1005231, 6545231, 
						3852085, 7576651, 7881200, 4581002};
		int result;
		int searchValue;
		String again;
		
		do
		{
			System.out.println("Enter account number you'd like to charge too: ");
			searchValue = key.nextInt();
			
			result = Arrays.binarySearch(charge, searchValue);
			
			if(result == -1)
			{
				System.out.println(searchValue + " was not found..");
			}
			else
			{
				System.out.println(searchValue + "was found!");
			}
			
			System.out.println("Would you like to charge again: (Y or N)");
			again = key.nextLine();
		}
		while(again.charAt(0) == 'y' || again.charAt(0) == 'Y');		
	}
	
	
	public static int binarySearch(int[] array, int value)
	{
		int first;
		int last;
		int middle;
		int position;
		boolean found;
		
		first = 0;
		last = array.length - 1;
		position = -1;
		found = false;
		
		while(!found && first <= last)
		{
			middle = (first + last) / 2;
			if(array[middle] == value)
			{
				found = true;
				position = middle;
			}
			else if(array[middle] > value)
				last = middle - 1;
			else
				first = middle + 1;
		}
		return position;	
	}
	
	
	
}

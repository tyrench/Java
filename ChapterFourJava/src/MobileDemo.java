import java.text.DecimalFormat;
import java.util.Scanner;
public class MobileDemo 
{
	public static void main(String[] args)
	{
		String input;
		char packLetter;
		double mins;
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Which package would you like: A / B / C :  ");
		input = key.nextLine();
		packLetter = input.charAt(0);
		packLetter = Character.toUpperCase(packLetter);
		
		if(packLetter < 'A' || packLetter > 'C')
		{
			System.out.println("Eror, PICK ONE (A B C)");
		}
		else
		{
			System.out.println("Numbers Used: ");
			mins = key.nextDouble();
			
			Mobile mobile = new Mobile(packLetter, mins);
			
			DecimalFormat dollar = new DecimalFormat("#,##0.00");
			
			System.out.println("Your total is:  $" + dollar.format(mobile.getTotalCharges()));
		}
		
	}
}

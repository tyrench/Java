package Retail;
import java.util.Scanner;
import java.text.DecimalFormat;

public class RetailItemDemo 
{
	public static void main(String[] args)
	{
		
		String desc;
		double price;
		int units;
		boolean input;
		
		Scanner key = new Scanner(System.in);
		
		RetailItem r = new RetailItem();
		
		System.out.print("Enter the item you are wanting to sell: ");
		desc = key.nextLine();
		r.setDescription(desc);
		
		do
		{
			System.out.print("Enter number of units you have: ");
			units = key.nextInt();
			try
			{
				r.setUnitsOnHand(units);
				input = true;
			}
			catch(NegativeUnits n)
			{
				System.out.println("ERROR: " + n.getMessage());
				input = false;
			}
		}while(!input);
		do
		{
			System.out.print("Enter the price of " + desc + ": ");
			price = key.nextDouble();
			try
			{
				r.setPrice(price);
				input = true;
			}
			catch(NegativeNumber n)
			{
				System.out.println("ERROR: " + n.getMessage());
				input = false;
			}
		}while(!input);
			
		
		DecimalFormat d = new DecimalFormat("#,##0.00");
			System.out.println("Description: " + r.getDescription());
			System.out.println("Units Aviablie: " + r.getUnitsOnHand());
			System.out.println("Price: $" + d.format(r.getPrice()));
	}
}
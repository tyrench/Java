import java.util.Scanner;
import java.text.DecimalFormat;

public class SoftwareDemo 
{
	public static void main(String[] args)
	{
		int units;
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter units sold:  ");
		units = key.nextInt();
				
		Software sales = new Software(units);
		
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		System.out.println("Units sold: " + sales.getUnitSold());
		System.out.println("Discount: $" + sales.getDiscount());
		System.out.println("Cost: $" + dollar.format(sales.getCost()));
	}
}

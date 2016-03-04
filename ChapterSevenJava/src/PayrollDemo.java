import java.util.Scanner;
import java.text.DecimalFormat;

public class PayrollDemo 
{
	public static void main(String[] args)
	{
		double payRate;
		double hours;
		
		Scanner key = new Scanner(System.in);
		Payroll pay = new Payroll();
		
		for(int i = 0; i < pay.seven; i++)
		{
			System.out.println("Enter numbers of hours worked for " + pay.getEmployeeID(i) + " :");
			hours = key.nextDouble();
			while(hours < 0)
			{
				System.out.println("Error: Enter again(bigger than zero) : ");
				hours = key.nextDouble();
			}
			
			System.out.println("Enter the pay rate for worker " + pay.getEmployeeID(i) + " :" );
			payRate = key.nextDouble();
			while(payRate < 6.0)
			{
				System.out.println("ERROR: Get another job... Enter again above $6.00: ");
				payRate = key.nextDouble();
			}
			
			pay.setHours(i, hours);
			pay.setPayRate(i, payRate);
			
		}
		
		DecimalFormat df = new DecimalFormat("#,##0.00"); 
		
		System.out.println("PAYROLL TOTALS");
		for(int i = 0; i < pay.seven; i++)
		{
			System.out.println("ID #" + pay.getEmployeeID(i) + " & Gross Pay: " + df.format(pay.getPay(i)));
		}
		
	}
}

import java.util.Scanner;

public class PayrollDemo 
{
	public static void main(String[] args)
	{
		int idNum;
		double grossPay;
		double stateTax;
		double federalTax;
		double fica;
		Scanner key = new Scanner(System.in);
		
		
		System.out.print("Enter your ID Number:  ");
		idNum = key.nextInt();
			while(idNum < 0)
			{
				System.out.print("Enter your ID Number: ");
				idNum = key.nextInt();
			}
			
		System.out.print("What is your gross pay: ");
		grossPay = key.nextDouble();
			while(grossPay < 0)
			{
				System.out.print("What is your gross pay: ");
				grossPay = key.nextDouble();
			}
		
		System.out.print("What is your state tax: ");
		stateTax = key.nextDouble();
			while (stateTax < 0)
			{
				System.out.print("What is your state tax: ");
				stateTax = key.nextDouble();
			}
		
		System.out.print("What is your federal tax: ");
		federalTax = key.nextDouble();
			while(federalTax < 0 )
			{
				System.out.print("What is your federal tax: ");
				federalTax = key.nextDouble();
			}
		
		System.out.print("What is your FICA withholding: ");
		fica = key.nextDouble();
			while(fica < 0)
			{
				System.out.print("What is your FICA withholding: ");
				fica = key.nextDouble();
			}
			
		Payroll pay = new Payroll(grossPay, stateTax, federalTax, fica);
	
			
		if(pay.getNetPay() <= 0)
		{
			System.out.println("ERROR: NO MONEY MADE" );
			System.out.print("What is your gross pay: ");
			grossPay = key.nextDouble();
				while(grossPay < 0)
				{
					System.out.print("What is your gross pay: ");
					grossPay = key.nextDouble();
				}
			
			System.out.print("What is your state tax: ");
			stateTax = key.nextDouble();
				while (stateTax < 0)
				{
					System.out.print("What is your state tax: ");
					stateTax = key.nextDouble();
				}
			
			System.out.print("What is your federal tax: ");
			federalTax = key.nextDouble();
				while(federalTax < 0 )
				{
					System.out.print("What is your federal tax: ");
					federalTax = key.nextDouble();
				}
			
			System.out.print("What is your FICA withholding: ");
			fica = key.nextDouble();
				while(fica < 0)
				{
					System.out.print("What is your FICA withholding: ");
					fica = key.nextDouble();
				}		
				Payroll roll = new Payroll(grossPay, stateTax, federalTax, fica);
				System.out.println("\t Payroll Report \t");
				System.out.println("\tYou made $" + roll.getNetPay());
		}
		
		else
		{
			System.out.println("\t Payroll Report \t");
			System.out.println("\tYou made $" + pay.getNetPay());
		}
		
	}
}

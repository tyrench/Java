import java.util.Scanner;
import java.text.DecimalFormat;

public class BankChargesDemo 
{
	public static void main(String[] args)
	{
		int checks;
		double balance;
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("What is the account balance? ");
		balance = key.nextDouble();
		
		System.out.println("How many checks were written?  ");
		checks = key.nextInt();
		
		BankCharges bc = new BankCharges(balance, checks);
		
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		System.out.println("Bank fee: $" + dollar.format(bc.getFees()));
	}
	
	
}

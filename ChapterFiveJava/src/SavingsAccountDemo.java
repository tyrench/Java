import java.util.Scanner;

public class SavingsAccountDemo 
{
	public static void main(String[] args)
	{
		double monthlyDepoisted;
		double totalDeposited = 0;
		double monthlyWithdrawn;
		double totalWithdrawn = 0;
		double interestRate;
		double interest = 0.0;
		double balance;
		int months;
		
		Scanner key = new Scanner(System.in);
		System.out.print("What is the annual interest rate: ");
		interestRate = key.nextDouble();
		
		System.out.print("What is the starting balance on this account: ");
		balance = key.nextDouble();
		
		System.out.print("How many months have passed since you opened your account: ");
		months = key.nextInt();
		
		SavingsAccount savings = new SavingsAccount(balance, interestRate);
		
		
		for(int start = 1; start <= months; start++)
		{
			System.out.println("How much money was depoisted this month: ");
			monthlyDepoisted = key.nextDouble();
			
			System.out.println("How much money was withdrawn this month: ");
			monthlyWithdrawn = key.nextDouble();
			
			

		}
		System.out.println("Balance: " + savings.getBalance());
		System.out.println("Total Interest: " + savings.getInterest());

	}
}

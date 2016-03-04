

public class SavingsAccount 
{
	 private double balance;
	 private double interestRate;
	 
	 public SavingsAccount(double b, double interest)
	 {
		 balance = b;
		 interestRate = interest;
	 }
	 
	 public void deposit(double d)
	 {
		 balance += d;
	 }
	 public void withdraw(double w)
	 {
		 balance -=w;
	 }
	 
	 private double interest = 0.0;
	 public void addInterest()
	 {
		 double monthlyInterest = interestRate / 12;
		 
		 interest = monthlyInterest * balance;
		 
		 balance += interest;
	 }

	 
	public double getBalance() 
	{
		return balance;
	}
	public double getInterestRate() 
	{
		return interestRate;
	}
	public double getInterest()
	{
		return interest;
	}
	 
	 
	 
	 
	
}

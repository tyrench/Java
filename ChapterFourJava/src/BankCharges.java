
public class BankCharges 
{
	private double fee = 10.0;
	private double lowBalance = 400.0;
	private double lowBalanceFee = 15.0;
	private int checksWritten;
	private double balance;
	
	public BankCharges(double b, int c)
	{
		balance = b;
		checksWritten = c;
	}
	public void setChecksWritten(int c)
	{
		checksWritten = c;
	}
	public void setBalance(double b)
	{
		balance = b;
	}
	
	public int getChecksWritten()
	{
		return checksWritten;
	}
	public double getBalance()
	{
		return balance;
	}
	
	public double getFees()
	{
		double fees = fee;
		
		if(balance < lowBalance)
		{
			fees += lowBalanceFee;
		}
		
		if(checksWritten >= 60)
		{
			fees += (checksWritten * 0.04);			
		}
		else if(checksWritten >= 40)
		{
			fees += (checksWritten * .06);
		}
		else if(checksWritten >= 20)
		{
			fees += (checksWritten * 0.08);
		}
		else
		{
			fees += (checksWritten * 0.1);
		}
		return fees;
			
	}
}

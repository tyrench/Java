
public class Payroll 
{
	double netPay;
	double grossPay;
	double stateTax;
	double federalTax;
	double fica;
	String idNum;
	
	public Payroll()
	{
		grossPay = 0;
		stateTax = 0;
		federalTax = 0;
		idNum = "";
	}
	
	public Payroll(double pay, double state, double federal, double f)
	{
		grossPay = pay;
		stateTax = state;
		federalTax = federal;
		fica = f;
	}
	

	public double getGrossPay() 
	{
		return grossPay;
	}
	public void setGrossPay(double grossPay) 
	{
		this.grossPay = grossPay;
	}
	public double getStateTax() 
	{	
		return stateTax;
	}
	public void setStateTax(double stateTax) 
	{
		this.stateTax = stateTax;
	}
	public double getFederalTax() 
	{
		return federalTax;
	}
	public void setFederalTax(double federalTax) 
	{
		this.federalTax = federalTax;
	}
	public double getFica() 
	{
		return fica;
	}
	public void setFica(double fica) 
	{
		this.fica = fica;
	}
	
	
	public double getNetPay()
	{
		netPay = grossPay - stateTax - federalTax - fica;
		return netPay;
	}
}

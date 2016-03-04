
public class ProductionWorker extends Employee 
{
	private int shift;
	private double payRate;

	
	public ProductionWorker(String n, String i, String hire, int s, double pay)
	{
		super(n,i,hire);
		shift = s;
		payRate = pay;
	}
	public int getShift() {
		return shift;
	}

	public void setShift(int shift) {
		this.shift = shift;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	@Override
	public String toString() {
		return "ProductionWorker: Name: " + getName() + "\n ID: " + getiD() + "\n Hire Date: " + getHireDate()
				+ "\n Class: " + getClass() + "\n Code: " + hashCode() + "\n String()=" + super.toString()
				+ "]";
	}
	
	

}

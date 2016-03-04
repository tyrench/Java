package Ticket;

public class ParkingMeter 
{
	private int minsPurchased;
	
	public ParkingMeter(int m)
	{
		minsPurchased = m;
	}

	public int getMinsPurchased() 
	{
		return minsPurchased;
	}

	public void setMinsPurchased(int minsPurchased) 
	{
		this.minsPurchased = minsPurchased;
	}
	
	
}

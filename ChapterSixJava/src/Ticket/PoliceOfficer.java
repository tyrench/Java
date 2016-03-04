package Ticket;

public class PoliceOfficer 
{
	private String officer;
	private String badge;
	
	public PoliceOfficer(String o, String num)
	{
		officer = o;
		badge = num;
	}
	public PoliceOfficer(PoliceOfficer officerTwo)
	{
		officer = officerTwo.officer;
		badge =officerTwo.badge;
	}
	
	public String getOfficer() 
	{return officer;}
	public void setOfficer(String officer) 
	{this.officer = officer;}
	
	public String getBadge() 
	{return badge;}
	public void setBadge(String badge) 
	{this.badge = badge;}
	
	public ParkingTicket ticket(ParkedCar car, ParkingMeter mins)
	{
		ParkingTicket ticketPrice = null;
		
		int overTime = car.getMinsParked() - mins.getMinsPurchased();
		
		if(overTime > 0)
		{
			ticketPrice = new ParkingTicket(car, this, overTime);
		}
		return ticketPrice;
	}
	
	public String toString()
	{
		String s = "Badge Number: " + badge + " Officer's Name: " + officer;
		return s;
	}
}

package Ticket;

public class ParkingTicketCollaborate 
{
	public static void main(String[] args)
	{
		ParkedCar car = new ParkedCar("Nissan", "2008", "Black",  "17MMZE9", 365);
		ParkingMeter meter = new ParkingMeter(60);
		PoliceOfficer officer = new PoliceOfficer("Scott Shoemyer", "3015");
		
		ParkingTicket park = officer.ticket(car, meter);
		
		
		if(park != null)
		{System.out.print(park);}
		else
		{System.out.print("No tickets for you!");}
		
	}
}

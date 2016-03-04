package Ticket;

import java.text.DecimalFormat;

public class ParkingTicket 
{
	private double totalFine = 0.0;
	private int mins;
	private double fine = 25.0;
	private double hourlyFine = 10.0;
	private ParkedCar car;
	private PoliceOfficer officer;
	
	public ParkingTicket(ParkedCar c, PoliceOfficer o, int m)
	{
		car = new ParkedCar(c);
		officer = new PoliceOfficer(o);
		mins = m;
		
		calcFine();
	}
	
	public ParkingTicket(ParkingTicket ticketTwo)
	{
		car = new ParkedCar(ticketTwo.car);
		officer = new PoliceOfficer(ticketTwo.officer);
		fine = ticketTwo.fine;
	}
	
	private void calcFine()
	{
		double hours = mins / 60;
		int hoursInt = (int)hours;
		
		if((hours - hoursInt) > 0)
		hoursInt++;
		
		totalFine = fine;
		totalFine += (hoursInt * hourlyFine);
	}
	
	public void setCar(ParkedCar c)
	{car = new ParkedCar(c);}
	
	public void setFine(double f)
	{fine = f;}
	
	public void setOfficer(PoliceOfficer o)
	{officer = new PoliceOfficer(o); }
	
	public ParkedCar getCar()
	{ return new ParkedCar(car); }
	
	public double getFine()
	{return fine;}
	
	public PoliceOfficer getPolice()
	{return new PoliceOfficer(officer);	}
	
	public String toString()
	{
		DecimalFormat d = new DecimalFormat("##,##0.00");
		String s = "Car \n" + car +
				"\nOfficer \n" + officer +
				"\n Minutes Illegally Park: " + mins +
				"\n Fine is: $" + d.format(fine);
		return s;
	}
	
}

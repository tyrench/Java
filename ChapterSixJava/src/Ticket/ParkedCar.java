package Ticket;

public class ParkedCar 
{
	private String model;
	private String make;
	private String license;
	private String color;
	private int minsParked;
	
	public ParkedCar(String mod, String mak, String l, String c, int mins)
	{
		model = mod;
		make = mak;
		license = l;
		color = c;
		minsParked = mins;
	}
	public ParkedCar(ParkedCar carTwo)
	{
		model = carTwo.model;
		make = carTwo.make;
		license = carTwo.license;
		color = carTwo.color;
		minsParked = carTwo.minsParked;
	}
	
	public String getModel() 
	{return model;}
	public void setModel(String model) 
	{this.model = model;}
	
	public String getMake() 
	{return make;}
	public void setMake(String make) 
	{this.make = make;}
	
	public String getLicense() 
	{return license;}
	public void setLicense(String license) 
	{this.license = license;}
	
	public String getColor()
	{return color;}
	public void setColor(String color) 
	{this.color = color;}
	
	public int getMinsParked() 
	{return minsParked;}
	public void setMinsParked(int minsParked) 
	{this.minsParked = minsParked;}
	
	public String toString()
	{
		String s= "Make:" + make + " The Model: " + model + " The LicensesPlate: " + license + " The Color: " + color + "Mins: " + minsParked;
		
		return s;
	}
	
}

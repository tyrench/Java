package Three;
public class RoomCarpet 
{
	private RoomDimension size;
	double cost;
	
	public RoomCarpet(RoomDimension d, double carpetCost)
	{
		size = new RoomDimension(d.getLength(), d.getWidth());
		cost = carpetCost;
	}
	
	public double getTotalCost()
	{
		return cost * size.getArea();
	}
	
	public String toString()
	{
		String s = "Room size: " + size + " and the Carpet Cost: " + getTotalCost();
		return s;
	}
	
	
}

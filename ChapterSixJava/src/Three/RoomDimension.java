package Three;

public class RoomDimension 
{
	double width;
	double length;
	
	public RoomDimension(double w, double l)
	{
		width = w;
		length = l;
	}

	public double getWidth() 
	{
		return width;
	}
	public double getLength() 
	{
		return length;
	}
	public double getArea()
	{
		return width * length;
	}
	
	public String toString()
	{
		String s = "The length is " + length + " the width is " + width + " and the area is " + getArea();
		return s;
	}
	
	
}


public class LandTract 
{
	private double length;
	private double width;
	
	public LandTract(double l, double w)
	{
		length = l;
		width = w;
	}
	
	public double getArea()
	{
		return length * width;
	}
	
	//page 415
	public boolean equals(LandTract tractTwo)
	{
		boolean expression;
		if(tractTwo.length == this.length && tractTwo.width == this.width)
			expression = true;
		else
			expression = false;
		
		return expression;
	}
	
	public String toString()
	{
		String s = "The length is: " + length + "\n The width is: " + width + "\n The area is: " + getArea();
		return s;
	}
}

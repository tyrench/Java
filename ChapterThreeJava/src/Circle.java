
public class Circle 
{
	private double radius;
	private double pi = 3.14159;
	private double area;
	private double diameter;
	private double circumference;
	
	public Circle()
	{
		radius = 0;
	}
	public void setRadius(double r)
	{
		radius = r;
	}
	
	public double getRadius()
	{
		
		return radius;
	}
	public double getArea()
	{
		area = pi * radius * radius;
		return area;
	}
	public double getDiameter()
	{
		diameter = radius * 2;
		return diameter;
	}
	public double getCircumference()
	{
		circumference = 2 * pi * radius;
		return circumference;
	}
	
}

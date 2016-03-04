
public class BodyMass 
{
	double weight;
	double height;
	double bmi;
	
	
	public BodyMass(double w, double h)
	{
		weight = w;
		height = h;
	}
	public void setWeight(int w)
	{
		weight = w;
	}
	public void setHeight(int h)
	{
		height = h;
	}
	
	public double getBMI()
	{
		bmi = weight * 703/(height * height);
		return bmi;
	}
}

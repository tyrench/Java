
public class Pet 
{
	private String name;
	private String type;
	private double age;
	
	public Pet()
	{
		name = "";
		type = "";
		age = 0;
	}
	public Pet(String n, String t, double a)
	{
		name = n;
		type = t;
		age = a;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	public void setType(String t)
	{
		type = t;
	}
	public void setAge(double a)
	{
		age = a;
	}
	
	public String getName()
	{
		return name;
	}
	public String getType()
	{
		return type;
	}
	public double getAge()
	{
		return age;
	}
	
}

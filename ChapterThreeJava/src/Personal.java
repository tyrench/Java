
public class Personal
{
	private String name;
	private String address;
	private int age;
	private String number;
	
	public Personal()
	{
		name = "";
		address = "";
		age = 0;
		number = "";
	}
	public Personal(String n, String ad, int a, String num)
	{
		name = n;
		address = ad;
		age = a;
		number = num;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	public void setAddress(String ad)
	{
		address = ad;
	}
	public void setAge(int a)
	{
		age = a;
	}
	public void setNumber(String num)
	{
		number = num;
	}
	
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public int getAge()
	{
		return age;
	}
	public String getNumber()
	{
		return number;
	}
}

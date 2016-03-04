
public class Employee 
{
	private String name;
	private int idNum;
	private String department;
	private String position;
		
	public Employee()
	{
		name ="";
		idNum = 0;
		department = "";
		position = "";
	}
	public Employee(String n, int id)
	{
		name = n;
		idNum = id;
		department = "";
		position = "";
	}
	public Employee(String n, int id, String dept, String pos)
	{
		name = n;
		idNum = id;
		department = dept;
		position = pos;
	}
	
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setIdNum(int num)
	{
		idNum = num;
	}
	
	public void setDepartment(String d)
	{
		department = d;
	}
	
	public void setPosition(String p)
	{
		position = p;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getIdNum()
	{
		return idNum;
	}
	
	public String getDepartment()
	{
		return department;
	}
	public String getPosition()
	{
		return position;
	}
}

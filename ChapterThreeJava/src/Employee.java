
public class Employee 
{
	private String name;
	private int idNum;
	private String department;
	private String position;
	
	//initlizes the name, idNum, department and position with  blank fields/0
	
	public Employee()
	{
		name ="";
		idNum = 0;
		department = "";
		position = "";
	}
	
	//initlizes the name, idNum, department and position
	public Employee(String n, int id, String dept, String pos)
	{
		name = n;
		idNum = id;
		department = dept;
		position = pos;
	}
	
	// initlizes the name and idNum 
	public Employee(String n, int id)
	{
		name = n;
		idNum = id;
		department = "";
		position = "";
	}
	
	//takes the argument stored in the field
	public void setName(String n)
	{
		name = n;
	}
	
	//takes the argument stored in the field
	public void setIdNum(int num)
	{
		idNum = num;
	}
	
	//takes the argument stored in the field
	public void setDepartment(String d)
	{
		department = d;
	}
	
	//takes the argument stored in the field
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


public class Employee 
{
	private String name;
	private String iD;
	private String hireDate;
	
	public Employee(String n, String i, String hire)
	{
		name = n;
		iD = i;
		hireDate = hire;
	}

	public String getName() 
	{return name;}

	public void setName(String name) 
	{this.name = name;}

	public String getiD() 
	{return iD;}

	public void setiD(String iD) 
	{this.iD = iD;}

	public String getHireDate() 
	{return hireDate;}

	public void setHireDate(String hireDate) 
	{this.hireDate = hireDate;}
	
	
	private boolean validEmpNum(String emp)
	{
		boolean stat = true;
		
		if(emp.length() != 5)
		{
			stat = false;
		}
		else
		{
		//	if(!Ch)
		}
		return stat;
	}
	
}

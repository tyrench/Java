public class ClassSetter
{
	public static void main(String[] args)
	{
		Class employee1 = new Class();
		employee1.setName("Susan Meyers");
		employee1.setIdnum(47899);
		employee1.setDepartment("Accounting");
		employee1.setPosition("Vice President");
		
		Class employee2 = new Class("Mark Jones", 39119, "IT", "Programmer");
		
		Class employee3 = new Class("Joy Rogers", 81774);
		employee3.setDepartment("Manufacturing");
		employee3.setPosition("Engineer");
		
		System.out.println("Employee #1");
		System.out.println("Name: " + employee1.getName());
		System.out.println("ID Number: " + employee1.getIdNum());
		System.out.println("Department:  " + employee1.getDepartment());
		System.out.println("Position:  " + employee1.getPosition());
		System.out.println();
		
		System.out.println("Employee #2");
		System.out.priintln("Name: " + employee2.getName());
		System.out.println("ID Number: " + employee2.getDepartment());
		System.out.println("Position: " + employee2.getPosition());
		System.out.println();
		
		System.out.println("Employee #3");
		System.out.println("Name: " + employee3.getName());
		System.out.println("ID Number: " + employee3.getDepartment);
		System.out.println("Postion: " + employee3.getPosition());
		System.out.println();
		
		
	}
}
public class EmployeeDemo
{
	public static void main(String[] args)
	{
		Employee employee1 = new Employee();
		employee1.setName("Susan Meyers");
		employee1.setIdNum(47899);
		employee1.setDepartment("Accounting");
		employee1.setPosition("Vice President");
		
		Employee employee2 = new Employee("Mark Jones", 39119, "IT", "President");
		
		Employee employee3 = new Employee("Joy Rogers",81774);
		employee3.setDepartment("Manufacturing");
		employee3.setPosition("Engineer");
		
		System.out.println("Employee #1");
		System.out.println("Name: " + employee1.getName());
		System.out.println("ID Number: " + employee1.getIdNum());
		System.out.println("Department:  " + employee1.getDepartment());
		System.out.println("Position:  " + employee1.getPosition());
		System.out.println();
		
		System.out.println("Employee #2");
		System.out.println("Name: " + employee2.getName());
		System.out.println("ID Number: " + employee2.getIdNum());
		System.out.println("Department: " + employee2.getDepartment());
		System.out.println("Position: " + employee2.getPosition());
		System.out.println();
		
		System.out.println("Employee #3");
		System.out.println("Name: " + employee3.getName());
		System.out.println("ID Number: " + employee3.getIdNum());
		System.out.println("Department: " + employee3.getDepartment());
		System.out.println("Postion: " + employee3.getPosition());
		System.out.println();
		
		
	}
}

public class PersonalDemo 
{
	public static void main(String[] args)
	{
		Personal person1 = new Personal();
		person1.setName("Tyler");
		person1.setAddress("261 Turtle Lane");
		person1.setAge(21);
		person1.setNumber("2178253101");
		
		Personal person2 = new Personal("Laura Rench", "261 Turtle Lane", 42, "2175555555");
		
		Personal person3 = new Personal();
		person3.setName("Kevin Rench");
		person3.setAddress("555 School Street");
		person3.setAge(51);
		person3.setNumber("2178256960");
		
		
		System.out.println("Information about myself");
		System.out.println("Name: " + person1.getName());
		System.out.println("Address: " + person1.getAddress());
		System.out.println("Age: " + person1.getAge());
		System.out.println("Cellphone Number: " + person1.getNumber());
		System.out.println();
		
		
		System.out.println("Information about my mom");
		System.out.println("Name: " + person2.getName());
		System.out.println("Address: " + person2.getAddress());
		System.out.println("Age: " + person2.getAge());
		System.out.println("Cellphone Number: " + person2.getNumber());
		System.out.println();		
		
		System.out.println("Information about my dad");
		System.out.println("Name: " + person3.getName());
		System.out.println("Address: " + person3.getAddress());
		System.out.println("Age: " + person3.getAge());
		System.out.println("Cellphone Number: " + person3.getNumber());
		System.out.println();
		
	}
}

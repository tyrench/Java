
public class CompanyDemo 
{
	public static void main(String[] args)
	{
		Employee bob = new Employee("Bob", "123-A", "12/23/2000");
		Employee bob2 = new Employee("BOB2", "123-B", "12/9/2008");
		
		ProductionWorker bill = new ProductionWorker("Bill", "234-B", "2/28/1994", 1, 12);
		
		System.out.println(bill.toString());
	}
}

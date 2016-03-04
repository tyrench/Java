
public class RetailItemDemo 
{
	public static void main(String[] args)
	{
		RetailItem item1 = new RetailItem();
		item1.setDescription("Jacket");
		item1.setUnitsOnHand(12);
		item1.setPrice(59.95);
		
		RetailItem item2 = new RetailItem();
		item2.setDescription("Designer Jeans");
		item2.setUnitsOnHand(40);
		item2.setPrice(34.95);
		
		RetailItem item3 = new RetailItem();
		item3.setDescription("Shirt");
		item3.setUnitsOnHand(20);
		item3.setPrice(24.95);
		
		System.out.println("Item #1");
		System.out.println("Description: " + item1.getDescription());
		System.out.println("Units on hand: " + item1.getUnitsOnHand());
		System.out.println("Price: " + item1.getPrice());
		System.out.println();
		
		System.out.println("Item #2");
		System.out.println("Description: " + item2.getDescription());
		System.out.println("Units on hand: " + item2.getUnitsOnHand());
		System.out.println("Price: " + item2.getPrice());
		System.out.println();
		
		System.out.println("Item #3");
		System.out.println("Description: " + item3.getDescription());
		System.out.println("Units on hand: " + item3.getUnitsOnHand());
		System.out.println("Price: " + item3.getPrice());
	}
}

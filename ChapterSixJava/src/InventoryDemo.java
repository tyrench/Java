
public class InventoryDemo 
{
	public static void main(String[] args)
	{
		Inventory item = new Inventory("Wrench", 50);
		System.out.println("Item 1: ");
		System.out.println("Description: " + item.getDescription());
		System.out.println("Units: " + item.getDescription());
		
		Inventory item1 = new Inventory(item);
		System.out.println("Item 2");
		System.out.println("Description: " + item1.getDescription());
		System.out.println("Units: " + item1.getUnits());
	}
}

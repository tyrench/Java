package Retail;

public class RetailDemo 
{
	public static void main(String[] args)
	{
		Retail item = new Retail("Clothes", 20202, 2.75, 35.99);
		System.out.println(item);
		
		item.setWholeSale(1.0);
		item.setRetail(1.99);
		System.out.println("WholeSale cost: " + item.getWholeSale());
		System.out.println("Retail Price: " + item.getRetail());
	}
}

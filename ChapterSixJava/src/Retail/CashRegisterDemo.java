package Retail;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.*;

public class CashRegisterDemo 
{
	public static void main(String[] args) throws IOException
	{
		Scanner key = new Scanner(System.in);
		int quanity;
		
		Retail items = new Retail("Clothes", 20202, 2.25, 35.99);
		System.out.println("How many shirts would you like to buy: ");
		quanity = key.nextInt();
		
		CashRegister register = new CashRegister(items, quanity);
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		
		PrintWriter output = new PrintWriter("SalesReceipt.txt");
		
		output.println("SALES RECEIPT");
		output.println("Unit Price: $" + dollar.format(items.getRetail()));
		output.println("Quantity: " + quanity);
		output.println("Subtotal: $" + dollar.format(register.getSubtotal()));
		output.println("Sales Tax: $" + dollar.format(register.getTax()));
		output.println("Total: $" + dollar.format(register.getTotal()));
		
		output.close();
		System.out.println("File created as SalesReceipt.txt!");
	}
}

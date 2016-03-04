import java.util.Scanner;
public class OneThree
{
	public static void main(String[] args)
	{
		double billTotal;
		double billTax = .075;
		double billTip = .18;
		double bill;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How much is your bill for the meal? ");
		bill = keyboard.nextDouble();
		
		billTax *= bill;
		billTip *= bill;
		
		billTotal = billTax + billTip + bill;
		
		System.out.printf("Your bill is $%3.2f\n", bill );
		System.out.printf("Your tax is $%2.2f\n", billTax);
		System.out.printf("Your tip is $%2.2f\n", billTip);
		System.out.printf("Your total bill is $%3.2f\n", billTotal);
	}
}
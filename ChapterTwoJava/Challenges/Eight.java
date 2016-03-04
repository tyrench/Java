import java.util.Scanner;

public class Eight
{
	public static void main(String[] args)
	{
		double stateTax = .055;
		double countryTax = .02;
		double totalStateTax;
		double totalCountryTax;
		double total;
		double sum;
		double totalTax;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter your purchase amount:  ");
		total = keyboard.nextInt();
		
		totalCountryTax = countryTax * total;
		totalStateTax = stateTax * total;
		totalTax = totalCountryTax + totalStateTax;
		sum = total + totalCountryTax + totalStateTax;
		
		
		System.out.printf("State Tax: $%,.2f\n", totalStateTax);
		System.out.printf("Country Tax: $%,.2f\n", totalCountryTax);
		System.out.printf("Total Tax: $%,.2f\n", totalTax);
		System.out.printf("Your total cost: $%,.2f\n", sum);
		
	}
}
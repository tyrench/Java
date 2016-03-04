public class Eightteen
{
	public static void main(String[] args)
	{
		double stocks = 1000;
		double stocksBought = 32.87;
		double stocksSold = 33.92;
		double commission = .02;
		double boughtTotal;
		double boughtCom;
		double soldTotal;
		double soldCom;
		double total;
		double totalBought;
		double totalSold;
		
		boughtTotal = stocks * stocksBought;
		boughtCom = boughtTotal * commission;
		soldTotal = stocks * stocksSold;
		soldCom = soldTotal * commission;
		
		totalBought = boughtTotal - boughtCom;
		totalSold = soldTotal - soldCom;
		
		total = boughtTotal - soldTotal;
		
		System.out.printf("Joe paid $%,.2f\n", boughtTotal);
		System.out.printf("Joe paid his broker $%,.2f\n", boughtCom);
		System.out.printf("Joe sold his stocks for $%,.2f\n", soldTotal);
		System.out.printf("Joe paid his broker $%,.2f when he sold his stocks.\n", soldCom);
		System.out.printf("After buying and selling stocks Joe has made or lost $%,.2f\n", total);
		
		
	}
}
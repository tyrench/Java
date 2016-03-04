public class Fourteen
{
	public static void main(String[] args)
	{
		double sharesBought = 1000;
		double sharesPrice = 25.50;
		double sharesCommission = .02;
		double priceOfShares;
		double totalPrice;
		
		priceOfShares = sharesBought * sharesPrice;
		sharesCommission *= priceOfShares;
		totalPrice = sharesCommission + priceOfShares;
		
		System.out.printf("Kathryn paid $%,.2f for her 1000 stocks. \n", priceOfShares);
		System.out.printf("Kathryn will pay $%,.2f for the stock broker. \n", sharesCommission );
		System.out.printf("Kathryn's total price is $%,.2f\n", totalPrice);
	}
}
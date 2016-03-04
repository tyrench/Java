
public class Mobile 
{
	private final char packIdA = 'A';
	private final char packIdB = 'B';
	private final char packIdC = 'C';
	
	private final double purchasePriceA = 39.99;
	private final double purchasePriceB = 59.99;
	private final double purchasePriceC = 69.99;
	
	private final double minsProvA = 450;
	private final double minsProvB = 950;
	private  final double minsProvC = 100000;
	
	private final double pricePerMinA = .45;
	private final double pricePerMinB = .40;
	private final double pricePerMinC = .00;
	
	private char packageIdentifer;
	
	private double minsUsed;
	private double minsProvided;
	private double pricePerMin;
	private double purchasePrice;
	private double addMins;
	private double addCharges;
	private double totalCharges;
	
	public Mobile(char p, double m)
	{
		packageIdentifer = Character.toUpperCase(p);
		
		minsUsed = m;
				
		switch(packageIdentifer)
		{
			case packIdA:
				minsProvided = minsProvA;
				pricePerMin = pricePerMinA;
				purchasePrice = purchasePriceA;
				break;
			case packIdB:
				minsProvided = minsProvB;
				pricePerMin = pricePerMinB;
				purchasePrice = purchasePriceB;
				break;
			case packIdC:
				minsProvided = minsProvC;
				pricePerMin = pricePerMinC;
				purchasePrice = purchasePriceC;
				break;
		}
		
		if(minsUsed > minsProvided)
		{
			addMins = minsUsed - minsProvided;
			
			addCharges = addMins * pricePerMin;
		}
		else
		{
			addMins = 0.0;
			addCharges = 0.0;
		}
		totalCharges = purchasePrice + addCharges;
	}
	
	public void setPackId(char p)
	{
		packageIdentifer = Character.toUpperCase(p);
	}
	
	public void setMinutuesUsed(double m)
	{
		minsUsed = m;
	}
	public char getPackageIdentifier()
	{
		return packageIdentifer;
	}
	public double getMinsUsed()
	{
		return minsUsed;
	}
	public double getMinsProvided()
	{
		return minsProvided;
	}
	public double getPricePerMin()
	{
		return pricePerMin;
	}
	public double getPurchasePrice()
	{
		return purchasePrice;
	}
	public double getAdditionalMins()
	{
		return addMins;
	}
	public double getAdditionalCharges()
	{
		return addCharges;
	}
	public double getTotalCharges()
	{
		return totalCharges;
	}

}

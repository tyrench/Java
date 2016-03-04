public class Sixteen
{
	public static void main(String[] args)
	{
		double customers = 15000;
		double buyTwo = .18;
		double citrusFlavor = .58;
		double outComeBuyTwo;
		double outComeCitrustFlavor;
		
		outComeBuyTwo = customers * buyTwo;
		outComeCitrustFlavor = customers * citrusFlavor;
		
		
		System.out.printf("%6.0f people buys two or more drinks every week. \n", outComeBuyTwo);
		System.out.printf("%6.0f people prefer citrus flavored energy drinks. \n", outComeCitrustFlavor);
	}
}
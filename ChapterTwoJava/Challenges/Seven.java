public class Seven
{
	public static void main(String[] args)
	{
		int acre = 43560;
		int totalAcre = 389767;
		double numberAcre;
		
		numberAcre = (double)totalAcre / acre;
		
		System.out.println("You would have " + numberAcre +
							" acres if you had " + totalAcre +
							" square feet.");
	}
}
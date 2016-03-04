
public class CnFTable 
{

	public static void main(String[] args)
	{
		double far;
		double cen;
		
		System.out.println("Centigrade \t Fahrenheit");
		System.out.println("---------------------------");
		
		for(cen = 0; cen <= 20; cen++)
		{
			far = (9.0 / 5.0) * cen + 32;
			System.out.println(cen + " \t \t " + far);
		}
	}
}

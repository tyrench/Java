import java.util.Scanner;
public class TemperatureDemo 
{
	public static void main(String[] args)
	{
		double fTemp;
		
		Scanner key = new Scanner(System.in);
		Temperature temp = new Temperature();
		
		System.out.println("What is the tempeature?  ");
		fTemp = key.nextDouble();
		
		temp.setFtemp(fTemp);
		
		System.out.printf("In Fahrenheit the temp is: %.2f\n", fTemp);
		System.out.printf("In celsius the temp is: %.2f\n", temp.getCelsius());
		System.out.printf("In kelvin the temp is: %.2f\n", temp.getKelvin());
		
	}
}

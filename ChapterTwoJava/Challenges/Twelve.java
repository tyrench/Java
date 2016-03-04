import java.util.Scanner;
public class Twelve
{
	public static void main(String[] args)
	{
		String city; 
		int citySize;
		char cityLetter;
		String upperCity;
		String lowerCity;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your favorite city?  ");
		city = keyboard.nextLine();
		
		citySize = city.length();
		cityLetter = city.charAt(0);
		upperCity = city.toUpperCase();
		lowerCity = city.toLowerCase();
		
		System.out.println(city + " has " + citySize + " characters.");
		System.out.println("The first letter in " + city +
							" is " + cityLetter);
		System.out.println(upperCity);
		System.out.println(lowerCity);

	}
}
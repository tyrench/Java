import java.util.Scanner;
public class OneFive
{
	public static void main(String[] args)
	{
		double sugar = .03125;
		double butter = .0208333334;
		double flour = .05729167;
		double cookies = 48;
		double guest;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many cookies would you like to make?  ");
		guest = keyboard.nextDouble();
		
		sugar *= guest;
		butter *= guest;
		flour *= guest;
		
		System.out.print("To make that many cookie syou would need.\n");
		System.out.printf("%.2f cups of sugar.\n", sugar);
		System.out.printf("%.2f cups of butter.\n", butter);
		System.out.printf("%.2f cups of flour.\n", flour);
		
	}
}
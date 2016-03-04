import java.util.Scanner;
public class FreezingDemo {

	public static void main(String[] args)
	{
		double temp;
		
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a tempature: ");
		temp = key.nextDouble();
		
		Frezzing frez = new Frezzing(temp);
		
		if(frez.isEthylFreezing()) System.out.println("Ethyl alcohol will freeze");
		if(frez.isEthylBoiling()) System.out.println("Ethly alcohol will boil");
		if(frez.isOxygenFreezing())	System.out.println("Water will freeze");
		if(frez.isOxygenBoiling()) System.out.println("Water will boil");
		if(frez.isWaterFreezing())	System.out.println("Oxygen will frezze");
		if(frez.isWaterBoiling())System.out.println("Oxygen will boil" );
	}
}

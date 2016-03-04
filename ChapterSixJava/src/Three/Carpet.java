package Three;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Carpet 
{
	public static void main(String[] args)
	{
		int width;
		int length;
		double carpetPrice = 8.0;
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("What is the width: ");
		width = key.nextInt();
		
		System.out.println("What is the length: ");
		length = key.nextInt();
		
		
		DecimalFormat d = new DecimalFormat("#,##0.00");
		RoomDimension room = new RoomDimension(width, length);
		RoomCarpet carpet = new RoomCarpet(room, carpetPrice);
		System.out.println("Total Carpet Cost: $"+ d.format(carpet.getTotalCost()));
	}
}

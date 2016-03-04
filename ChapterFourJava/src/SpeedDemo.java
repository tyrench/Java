import java.util.Scanner;
public class SpeedDemo 
{
	public static void main(String[] args)
	{
		double distance;
		double time;
		String input;
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("Please select one of the three: ");
		System.out.println("water, air, steel");
		input = key.nextLine();
		System.out.print("");
		
		System.out.println("How far of a distance does the sound travel? ");
		distance = key.nextDouble();
		Speed s = new Speed(input, distance);	
		
		switch(input)
		{
		case "water":
			System.out.println("It took " + s.getSpeedInWater() + " second(s) to travel that far");
		break;
		case "air":
			System.out.println("It took " + s.getSpeedInAir() + " second(s) to travel that far");
		break;
		case "steel":
			System.out.println("It took " + s.getSpeedInSteel() + " second(s) to travel that far");
		break;
		
		default:
			System.out.println("Please enter one of the words: \n air, water, steel");
		}
	}
}

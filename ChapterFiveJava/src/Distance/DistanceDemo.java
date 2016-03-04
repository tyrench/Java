package Distance;
import java.util.Scanner;
import java.io.*;
public class DistanceDemo 
{
	public static void main(String[] args)throws IOException
	{
		int speed;
		int hours;
		int distance;
		String filename;
		
		
		Scanner key = new Scanner(System.in);
		System.out.print("Enter a file name:  ");
		filename = key.nextLine();
		
		PrintWriter outFile = new PrintWriter(filename);
		
		System.out.println("Enter your speed you've been traveling at");
		speed = key.nextInt();
		
		while(speed <= 1)
		{
			System.out.println("Enter a speed greater than 0: ");
			speed = key.nextInt();
		}
		
		System.out.print("How many hours have you been driving? ");
		hours = key.nextInt();
		
		while(hours <= 1)
		{
			System.out.println("I wish we could drive back in time ");
			System.out.print("How many hours though, really:  ");
			hours = key.nextInt();
		}
		
		outFile.println("Hour \t   Distance Traveled");
		outFile.println("---------------------------------");
		
		distance = 0;
		while(distance <= hours)
		{
			Distance d = new Distance(speed, distance);
				
					outFile.println(distance + "\t\t " + d.getDistance());
			
			distance++;
			
		}
		System.out.println("File created!");
		outFile.close();
	}
	
}

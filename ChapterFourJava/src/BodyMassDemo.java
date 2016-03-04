import java.util.Scanner;
public class BodyMassDemo 
{
	public static void main(String[] args)
	{
		double weight;
		double height;
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Please enter your weight in pounds: ");
		weight = key.nextDouble();
		
		System.out.println("Please enter your height in inches:  ");
		height = key.nextDouble();
		
		
		BodyMass mass = new BodyMass(weight, height);
		
		if(mass.getBMI() > 25)
		{
			System.out.println("Your body mass index is " + mass.getBMI() + " which is considered overweiht");
		}
		else if(mass.getBMI() < 25 && mass.getBMI() > 18.5)
		{
			System.out.println("Your body mass index is " + mass.getBMI() + ", which is considered healthy!");	
		}
		else if(mass.getBMI() < 18.5)
		{
			System.out.println("Your body mass index is " + mass.getBMI() + ", which is considered underweight.");
		}
	}
	
}

import java.util.Scanner;
public class RunnersDemo 
{
	public static void main(String[] args)
	{
		String runner;
		double time;
		
		Scanner key = new Scanner(System.in);
		Runners run = new Runners();
		
		System.out.println("Ties cannot happen");
		System.out.println("Enter a runner's name: ");
		runner = key.nextLine();
		System.out.println("Enter that runner's time: ");
		time = key.nextDouble();
		run.setRunner1(runner);
		run.setTime1(time);
		
		System.out.println("Enter another runner's name: ");
		runner = key.nextLine();
		runner = key.nextLine();
		System.out.println("Enter that runner's time: ");
		time = key.nextDouble();
		run.setRunner2(runner);
		run.setTime2(time);
		
		System.out.println("Enter another runner's name: ");
		runner = key.nextLine();
		runner = key.nextLine();
		System.out.println("Enter that runner's time: ");
		time = key.nextDouble();
		run.setRunner3(runner);
		run.setTime3(time);
		
		System.out.println("#1: " + run.getFirstPlace());
		System.out.println("#2: " + run.getSecondPlace());
		System.out.println("#3: " + run.getThirdPlace());
		
		
	}
}

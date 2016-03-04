//three
import java.util.Scanner;
public class PayrollDemo 
{
	public static void main(String[] args)
	{
		String name;
		int idNum;
		double hourlyRate;
		double hoursWorked;
		
		Scanner key = new Scanner(System.in);
		Payroll pay = new Payroll();

		System.out.println("What is your name? ");
		name = key.nextLine();
		System.out.println("Thank you " + name + " please fill out the rest.");
		
		System.out.println("What is your ID number?  ");
		idNum = key.nextInt();
		
		System.out.println("What is your hourly rate?" );
		hourlyRate = key.nextDouble();
		
		System.out.println("How many hours do you work? ");
		hoursWorked = key.nextDouble();
		
		pay.setHourlyRate(hourlyRate);
		pay.setHoursWorked(hoursWorked);
		
		
		System.out.println(name + " ID: " + idNum);
		System.out.printf("You would make $%.2f for this weeks paycheck.", pay.getRate());
		
	}
}

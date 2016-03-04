import java.util.Scanner;
public class Sum 
{
	public static void main(String[] args)
	{
		int user;
		int total = 0;
		int add = 1;
		
		int num = 1;
		Scanner key = new Scanner(System.in);
		System.out.println("What number would you like to count to? ");
		user = key.nextInt();
		while(user <= 0)
		{
			System.out.println("Error: enter a postive number:  ");
			user = key.nextInt();
		}
		
		while(add <= user)
		{
			total += add;
			
			add++;
		}
		
		System.out.print("The sum of 1 through " + user + " is: ");
		System.out.println(total);
	}
}

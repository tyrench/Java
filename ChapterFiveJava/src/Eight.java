import java.util.Scanner;

public class Eight 
{
	public static void main(String[] args)
	{
		int user;
		int biggest;
		int smallest;

		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter numbers, and you will see the \nlargest to see if I can get the smallest and largest");
		System.out.println("Enter a number or enter -99 to quit");
		user = key.nextInt();
		
		biggest = user;
		smallest = user;
		
		while (user != -99)
		{
			System.out.println("Enter a number or enter -99 to quit");
			user = key.nextInt();
			
			if(user > biggest)
			{
				biggest = user;
			}
			if (user != -99 && user < smallest)
			{
				smallest = user;
			}
		}
		
		System.out.println("A big number: " + biggest);
		System.out.println("A reeeallly small number: " + smallest);
	}
}

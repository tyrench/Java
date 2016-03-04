import java.util.Scanner;
public class Roman 
{
	public static void main(String[] args)
	{
		int num;
		Scanner key = new Scanner(System.in);
		
		System.out.print("Enter a number 1 - 10:  ");
		num = key.nextInt();
		
			switch(num)
			{
			case 1:
				System.out.println("I");
				break;
			case 2:
				System.out.println("II");
				break;
			case 3:
				System.out.println("III");
				break;
			case 4:
				System.out.println("IV");
				break;
			case 5:
				System.out.println("V");
				break;
			case 6:
				System.out.println("VI");
				break;
			case 7:
				System.out.println("VII");
				break;
			case 8:
				System.out.println("VIII");
				break;
			case 9:
				System.out.println("IX");
				break;
			case 10:
				System.out.println("X");
				break;
			default:
				System.out.println("You did not enter a number 1-10. Please try again");
		}
	}
}

import java.util.Scanner;


public class Larger 
{
	public static void main(String[] args)
	{
		int num;
		int[] numbers = {7, 17,27,37,47,57,67,67,77,87,97,100};
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("Enter a number greater than zero:  ");
		num = key.nextInt();
		
		displayGreaterThan(numbers, num);
		
	}
	
	public static void displayGreaterThan(int[] array, int n)
	{
		for(int numbers : array)
		{
			if(numbers > n)
			{
				System.out.println(numbers);
			}
		}
	}
}

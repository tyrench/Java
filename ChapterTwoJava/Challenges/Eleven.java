import java.util.Scanner;
public class Eleven
{
	public static void main(String[] args)
	{
		int males;
		int females;
		int totalClass;
		double malePercent;
		double femalePercent;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many males are in the class? ");
		males = keyboard.nextInt();
		System.out.print("How many femailes are in the class?  ");
		females = keyboard.nextInt();
		
		totalClass = females + males;
		
		malePercent = (double)males / totalClass;
		femalePercent = (double)females / totalClass;
		malePercent *= 100;
		femalePercent *= 100;
		
		System.out.printf("There are %.2f percent of men in the class\n", malePercent);
		System.out.printf("There are %.2f percent of ladies in the class", femalePercent);
		
		


		
	}
}
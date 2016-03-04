package FileArrayClass;
import java.io.*;
public class FileArrayDemo 
{
	public static void main(String[] args)
	{
		int[] userInput = new int[6];
		int[] numberInput = {1,2,3,4,5,6};
		
		
		try 
		{
			FileArray.writeArray("Text.txt", numberInput);
			System.out.println("Reading numbers in Text.txt file....");
			FileArray.readArray("Text.txt", userInput);
			System.out.println("The numbers are: ");
			for(int i = 0; i < userInput.length; i++)
			{
				System.out.println(userInput[i]);
			}
			
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}

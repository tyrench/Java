package FileArrayClass;
import java.io.*;

public class FileArray 
{
	public static void writeArray(String file, int[] array) throws IOException
	{
		//opens the file
		FileOutputStream f = new FileOutputStream(file);
		DataOutputStream output = new DataOutputStream(f);
		
		//Writes to the txt file
		for(int i = 0; i< array.length; i++)
		{
			output.writeInt(array[i]);
		}
		
		//closes the txt file
		output.close();
	}
	
	public static void readArray(String file, int[] array) throws IOException
	{
		//opens the file
		DataInputStream output = new DataInputStream(new FileInputStream(file));
		
		//Reads the txt file
		for(int i = 0; i < array.length; i++)
		{
			array[i] = output.readInt();
		}
		output.close();
		
	}
}

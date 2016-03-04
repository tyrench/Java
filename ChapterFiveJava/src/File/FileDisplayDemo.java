package File;
import java.io.*;

public class FileDisplayDemo 
{
	public static void main(String[] args) throws IOException
	{
		FileDisplay f = new FileDisplay("File.txt");
		System.out.println("File Head: ");
		f.displayHead();
		
		System.out.println("\n\nFile's first five lines: \n");
		f.displayContents();
		
		System.out.println("]n]nLined lines: \n");
		f.displayWithLineNums();
	}
}

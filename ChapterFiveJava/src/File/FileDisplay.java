package File;
import java.io.*;
import java.util.Scanner;

public class FileDisplay 
{

	private String fileName;
	private Scanner file;

	public FileDisplay(String fileN)
	{
		fileName = fileN;
	}
	
	private void openFile() throws IOException
	{	
		File files = new File(fileName);
		file = new Scanner(files);
		
	}
	
	public void displayHead() throws IOException
	{
		String user;
		int count = 1;
		
		openFile();
		
		while(file.hasNext() && count <= 5)
		{
			user = file.nextLine();
			System.out.println(user);
			count++;
		}
		file.close();
	}
	
	public void displayContents() throws IOException
	{
		String user;
		openFile();
		while(file.hasNext())
		{
			user = file.nextLine();
			System.out.println(user);
		}
		file.close();
	}
	
	public void displayWithLineNums() throws IOException
	{
		String user;
		int line = 1;
		openFile();
		while(file.hasNext())
		{
			user = file.nextLine();
			System.out.println(line + ": " + user );
			line++;
		}
		file.close();
	}
	

}

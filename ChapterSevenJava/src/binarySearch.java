
	/**
	 * @author
	 * This program will automatically generate a random word, prompting the user to guess 
	 * the word letter by letter
	 */
	import java.util.*;
	import java.lang.String;
	public class binarySearch {
		public static StringBuilder newString = new StringBuilder();

		@SuppressWarnings("resource")
		public static void main(String[] args) {
			
			//Array creation
		String words[] = {"homework","computer","program","game","music","code","sports","dancing",
							"explorer","inernet"};
	    boolean gameOver = false;
	    int missed = 0; 

	    
			//create the random generator to select the word to play with 
		int number = (int)(Math.random()*10);
		  	//creating an string with the preselected word
		String game = words[number];
			//counting the amount of characters the word has 
		int num = words[number].length();
			// string that will hold the swap to letters 
		String temp;
		char charInputed;
		
		//First output... greeting to user 
		System.out.println("Lets start playing!");
		
		
		
		
		//changing the characters of the word for ***
		for (int count = 0 ; count <= num ; count++)
		{
			newString.append("*");	
		}
		while(gameOver == false )
		{
			if (!game.equals(newString.toString()))
			{
				Scanner input = new Scanner(System.in);
				System.out.println("Guess the following word" + newString + " > ");
				charInputed = input.next().charAt(0);
				
				
		
				//test if the letter selected was the correct one 
				// adding also the counted of missed selections 
				if (game.contains(charInputed + "") == false)
				{
					missed ++;
					
					//replace the characters in the originals if they where right
					for (int i = 0 ;i < num; i++)
					{
						if (game.charAt(i) == charInputed)
						{
							temp = Character.toString(game.charAt(i));
							newString.replace(i, (i+1), temp);
						}
					}
				}
			}
		}

	}
}

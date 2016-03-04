import java.util.Scanner;
public class DriverDemo 
{
	public static void main(String[] args)
	{
		String user;
		int answer = 20;
		char[] answers = new char[answer];
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter your answeres in ALL CAPS");
		
		for(int i = 0; i < answers.length; i++)
		{
			System.out.println("Question " + (i + 1) + ": ");
			user = key.nextLine();
			answers[i] = user.charAt(0);
			
			while(!correct(answers[i]))
			{ 
				System.out.println("ERROR: Enter A B C or D");
				System.out.println("Question " + (i + 1) + ": ");
				answers[i] = user.charAt(0);
			}
		}
		
		Driver grade = new Driver(answers);
		int[] missedQuestions = grade.questionsMissed();
		
		System.out.println("Questions Correct: " + grade.answeredRight());
		System.out.println("Questions Incorrect: " + grade.answeredWrong());
		
		if(missedQuestions != null)
		{
			System.out.println("You missed these questions... ");
			System.out.println("Good Luck..");
			
			for(int i = 0; i < missedQuestions.length; i++)
				System.out.print(missedQuestions[i] + " ,");
		}
		
		if(grade.smart())
			System.out.print("You passed the exam");
		else
			System.out.println("You failed.." );
	}
	public static boolean correct(char c)
	{
		boolean right;
		if(c=='A' || c=='B' || c=='C' || c=='D')
			right = true;
		else
			right = false;
		return right;
	}
}

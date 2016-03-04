
public class Driver 
{
	private char[] correctAnswers = {'B', 'D', 'A', 'A', 
									'C', 'A', 'B', 'A', 
									'C', 'D', 'B', 'C',
									'C', 'B', 'D', 'A' };
	
	private char[] answer;
	private int Correct = 0;
	private int Incorrect =0;
	private int[] missed;
	
	public Driver(char[] a)
	{
		answer = new char[a.length];
		for(int i = 0; i < a.length; i++)
			answer[i] = a[i];
		
		gradeExam();
	}
	public void gradeExam()
	{
		for(int i = 0; i < answer.length; i++)
		{
		if(answer[i] == correctAnswers[i])
			Correct++;
		else
			Incorrect++;
		}
		missedArray();
	}
	
	public void missedArray()
	{
		int missedUser = 0;
		
		if(Incorrect > 0)
		{
			missed = new int[Incorrect];
			for(int i = 0; i < answer.length; i++)
			{
				while(answer[i] != correctAnswers[i])
				{
					missed[missedUser] = (i + 1);
					missedUser++;
				}
			}
		}
	}
	public int[] questionsMissed()
	{
		int[] m = null;
		if (missed != null)
		{
			m = new int[missed.length];
			for(int i = 0; i < missed.length; i++)
				m[i] = missed[i];
		}
		
		return m;
	}
	
	//passed method
	public boolean smart()
	{
		boolean user;
		if(Correct >= 15)
			user = true;
		else 
			user = false;
		return user;
	}
	
	public int answeredRight()
	{
		return Correct;
	}
	public int answeredWrong()
	{
		return Incorrect;
	}
	
}

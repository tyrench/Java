import java.util.Scanner;
public class HotDog 
{
	public static void main(String[] args)
	{
		int hotDogPerPack = 10;
		int bunsPerPack = 8;
		int numAttending;
		int numPerPerson;
		int total;
		int miniDogs;
		int miniBuns;
		int dogsLeft;
		int bunsLeft;
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("How many people are attending the cookout? ");
			numAttending = key.nextInt();
		System.out.println("How many hot dogs per person? ");
			numPerPerson = key.nextInt();
			
		total = numAttending * numPerPerson;
		
		miniDogs = total / hotDogPerPack;
		
		
		if(miniDogs > 0)
		{
			dogsLeft = total % hotDogPerPack;
			
			if(dogsLeft != 0)
			{
				miniDogs += 1;
			}
		}
		else
		{
			miniDogs = 1;
		}
		
		
		dogsLeft = hotDogPerPack * miniDogs - total;
		miniBuns = total / bunsPerPack;
		if(miniBuns > 0)
		{
			bunsLeft = total % bunsPerPack;
			
			if(bunsLeft != 0)
			{
				miniBuns += 1;
			}
		}
		else
			miniBuns = 1;
		
		
		
		bunsLeft = bunsPerPack * miniBuns - total;
		System.out.println("Minimum packs of hot dogs: " + miniDogs);
		System.out.println("Minimum packs of buns: " + miniBuns);
		System.out.println("Hot dogs left over: " + dogsLeft );
		System.out.println("Buns left over: " + bunsLeft);
		
	}
}

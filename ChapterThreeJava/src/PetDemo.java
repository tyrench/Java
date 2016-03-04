import java.util.Scanner;
public class PetDemo 
{
	public static void main(String[] args)
	{
		String userPetType;
		String userPetName;
		double userPetAge;
		
		Scanner keyboard = new Scanner(System.in);
		
		Pet user = new Pet();
		
		System.out.println("What type of pet do you have?");
		userPetType = keyboard.nextLine();
		System.out.println();
		
		System.out.println("What is the name of your " + userPetType );
		userPetName = keyboard.nextLine();
		System.out.println();
		
		System.out.println("How old is your pet? ");
		userPetAge = keyboard.nextDouble();
		System.out.println();
		
		
		user.setName(userPetName);
		user.setAge(userPetAge);
		user.setType(userPetType);
		
		
		System.out.println("Your " + user.getType() + " is named " + user.getName() + " and is " + user.getAge() + " years old.");
	}
}

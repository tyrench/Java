import java.util.Scanner;
public class Seventeen
{
	public static void main(String[] args)
	{
		String name;
		int age;
		String city;
		String college;
		String profession;
		String animal;
		String petName;
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("WORD GAME");
		System.out.println("What is your name?  ");
			name = keyboard.nextLine();
		System.out.println("What is your age? ");
			age = keyboard.nextInt();
		System.out.println("");
			city = keyboard.nextLine();
		System.out.println("What city did you live in? ");
			city = keyboard.nextLine();
		System.out.println("What college did you attend?  ");
			college = keyboard.nextLine();
		System.out.println("What is your job?  ");
			profession = keyboard.nextLine();
		System.out.println("What kind of animal do you have?  ");
			animal = keyboard.nextLine();
		System.out.println("What is your pet's name?  ");
			petName = keyboard.nextLine();
			
		System.out.println("There once was a person named " + name +
							" who lived in " + city + 
							". At the age of " + age + ", " + name +
							" went to college at " + college + 
							". " + name + " graudated and went to work" +
							" as a " + profession + ". Then, " + name +
							" adopted a(n) " + animal + " named " + petName +
							". They both lived happily ever after!");
		
	}
}
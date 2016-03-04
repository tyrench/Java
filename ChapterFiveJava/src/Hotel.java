import java.util.Scanner;
public class Hotel 
{
	public static void main(String[] args)
	{
		int floors;
		int rooms;
		int totalRooms = 0;
		int occupied;
		int totalOccupied = 0;
		int vacantRooms;
		double occupancy = 0;
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("How many floors are in your hotel? (including your lobby) ");
		floors = key.nextInt();
		while(floors < 1)
		{
			System.out.println("You can't just have a lobby");
			System.out.println("Enter the number of floors above 1:  ");
			floors = key.nextInt();
		}
		System.out.println("Floor G: Lobby (zero rooms, zero guest)");
		for(int i = 1; i < floors; i++)
		{
			System.out.print("Number of rooms on floor " + i + ": ");
			rooms = key.nextInt();
			while(rooms < 10)
			{
				System.out.println("You have to have more then ten rooms on a floor, enter again ");
				rooms = key.nextInt();
			}
			
			totalRooms += rooms;
			
			System.out.print("Rooms occupied: ");
			occupied = key.nextInt();
			while(occupied > rooms)
			{
				System.out.print("Enter a larger number: ");
				occupied = key.nextInt();
			}
			totalOccupied += occupied;
			
		}
		
		vacantRooms = totalRooms - totalOccupied;
		occupancy = (double)totalOccupied / totalRooms;
		
		occupancy *= 100;
		System.out.println("Number of rooms: " + totalRooms);
		System.out.println("Occupied rooms: " + totalOccupied);
		System.out.println("Vacant rooms: " + vacantRooms);
		System.out.println("Occupancy rate: " + occupancy + "%");
	}
}

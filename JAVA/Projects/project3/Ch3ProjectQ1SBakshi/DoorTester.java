/**
	A class to test the Door class.
*/
public class DoorTester
{
	public static void main(String[] args)
	{
		DoorV6 frontDoor = new DoorV6("Front", "open");
		System.out.println("The front door is " + frontDoor.getState());
		System.out.println("Expected:  open");
		DoorV6 backDoor = new DoorV6("Back", "closed");
		System.out.println("The back door is " + backDoor.getState());
		System.out.println("Expected:  closed");
		backDoor.setState("open");
		System.out.println("The back door is " + backDoor.getState());
		System.out.println("Expected:  open");
		backDoor.setName("myBackDoor");
		System.out.println("The back door is called " + backDoor.getName());
		System.out.println("Expected: myBackDoor");
		DoorV6 sideDoor = new DoorV6("side", "closed");
		System.out.println("The side door is " + sideDoor.getState());
		System.out.println("Expected:  closed");
		System.out.println("The side door is called " + sideDoor.getName());
		System.out.println("Expected: side");
		sideDoor.setState("open");
		System.out.println("The side door is " + sideDoor.getState());
		System.out.println("Expected:  open");
	}
}
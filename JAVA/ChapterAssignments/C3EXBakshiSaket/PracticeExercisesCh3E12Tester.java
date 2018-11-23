/*
Saket Bakshi
Period 6
10/4/18
This program tests the Bug class.
*/
public class PracticeExercisesCh3E12Tester
{	
	public static void main(String[] args)
	{
		PracticeExercisesCh3E12 bugsy = new PracticeExercisesCh3E12(5); //creates new Bug class variable

		bugsy.move(); 
		bugsy.move(); //moves the bug two space
		System.out.println(bugsy.getPosition()); //should return bug's position
		System.out.println("Expected Position: 7"); //position should be 7

		bugsy.turn(); //testing turn of direction
		bugsy.move();
		bugsy.move();
		bugsy.move();
		bugsy.move(); //moves bug 4 spaces in new direction

		System.out.println(bugsy.getPosition());
		System.out.println("Expected Position: 3"); //new position should be three
	}
}
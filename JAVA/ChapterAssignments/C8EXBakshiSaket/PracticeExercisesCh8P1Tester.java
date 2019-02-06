/* Saket Bakshi 2/3/19. Period 6
This program, for Project 1 of Ch 8, tests a class that opens a three digit lock.
*/
public class PracticeExercisesCh8P1Tester
{
	public static void main(String[] args)
	{	
		PracticeExercisesCh8P1 test = new PracticeExercisesCh8P1(10, 20, 5);
		System.out.println("Code is set to \"10, 20, 5\"");

		test.turnLeft(23);
		test.turnRight(30);
		test.turnLeft(5);
		System.out.println("\tExpected: Lock should not open. Code inputted was 23, 33, 38.");
		test.open();
		test.reset();

		test.turnLeft(10);
		test.turnRight(30);
		test.turnLeft(25);
		System.out.println("\tExpected: Lock should open.");
		test.open();
	}
}
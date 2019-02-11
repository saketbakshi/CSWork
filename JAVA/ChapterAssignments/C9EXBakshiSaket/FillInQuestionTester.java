/** Saket Bakshi. 2/10/19. Period 6. This is used for question 2 of Chapter 9.
	Tests the FillInQuestion class.
*/
import java.util.Scanner;

public class FillInQuestionTester
{
	public static void main(String[] args)
	{
		FillInQuestion tester = new FillInQuestion("The inventor of Java was _James Gosling_");
		tester.display();

		Scanner key = new Scanner(System.in);
		String answer = key.next();
		if(tester.checkAnswer(answer))
			System.out.println("You're correct.");
		else
			System.out.println("Wrong.");
	}
}
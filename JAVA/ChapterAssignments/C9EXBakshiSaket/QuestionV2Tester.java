/** Saket Bakshi. 2/10/19. Period 6. This is used for question 3 of Chapter 9.
	Tests the QuestionV2 class.
*/
import java.util.Scanner;

public class QuestionV2Tester
{
	public static void main(String[] args)
	{
		QuestionV2 tester = new QuestionV2();
		tester.setText("Who invented Java?");
		tester.setAnswer("James Gosling");
		tester.display();
		Scanner key = new Scanner(System.in);
		String answered = key.next();
		if(tester.checkAnswer(answered))
			System.out.println("You're correct.");
		else
			System.out.println("Wrong.");
	}
}
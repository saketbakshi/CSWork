/** Saket Bakshi. 2/10/19. Period 6. This is used for question 1 of Chapter 9.
	Tests the NumericQuestion class.
*/
import java.util.Scanner;

public class NumericQuestionTester
{
	public static void main(String[] args)
	{
		NumericQuestion tester = new NumericQuestion();
		tester.setText("What is 2+2?");
		tester.setAnswer(4);
		tester.display();
		Scanner key = new Scanner(System.in);
		double answered = key.nextDouble();
		if(tester.checkAnswer(answered))
			System.out.println("You're correct.");
		else
			System.out.println("Wrong.");
	}
}
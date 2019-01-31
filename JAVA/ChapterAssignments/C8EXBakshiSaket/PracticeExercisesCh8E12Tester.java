/* Saket Bakshi 1/30/19. Period 6
This program, for #12 of Ch 8, tests whether an integer is between a minimum or maximum.
*/
import java.util.Scanner;

public class PracticeExercisesCh8E12Tester
{
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		System.out.print("What do you want as your prompt for asking for an integer? ");
		String prompt = key.next();
		System.out.println();

		System.out.print("Give me an error message, a minimum integer, and a maximum integer. ");
		String error;
		error = key.next();
		System.out.println();

		System.out.print("Give me a minimum: ");
		int min  = key.nextInt();
		//int max = key.nextInt();

		//PracticeExercisesCh8E12 test = new PracticeExercisesCh8E12();
		//test.readInt(key, prompt, error, min, max);
	}
}
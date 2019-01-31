/* Saket Bakshi 1/30/19. Period 6
This program, for #12 of Ch 8, tests whether an integer is between a minimum or maximum.
*/
import java.util.Scanner;

public class PracticeExercisesCh8E12
{
	public static void readInt(Scanner in, String prompt, String error, int min, int max)
	{
		System.out.println("The prompt is: \"" + prompt + "\"");
		int tested = in.nextInt();
		if(tested >= min && tested <= max)
		{
			System.out.println("The integer is between your given maximum and minimum.");
		}
		else
		{
			System.out.println(error);
		}
	}
}
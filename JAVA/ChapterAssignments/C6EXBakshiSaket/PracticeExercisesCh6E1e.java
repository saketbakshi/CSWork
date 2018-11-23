/* Saket Bakshi. 11/21/18. Period 6
This program, for #1e of Ch 6, the sum of all odd digits in an input.
*/
import java.util.Scanner;

public class PracticeExercisesCh6E1e
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);

		System.out.println("Give me an integer.\nI'll find the sum of all the odd digits in the integer.");

		String integer = key.next();
		int answer = 0;

		for(int i = 0; i <= integer.length() - 1; i++)
		{
			String temp = integer.substring(i, i + 1);
			int tempInt = Integer.parseInt(temp);
			if(tempInt % 2 == 1)
				answer = answer + tempInt;
		}
		System.out.println("The answer is " + answer);
	}
}
/* Saket Bakshi. 11/21/18. Period 6
This program, for #1a of Ch 6, calculates the sum of all even numbers between 2 and 100, inclusive.
*/
public class PracticeExercisesCh6E1a
{
	public static void main(String[] args)
	{
		int sum = 0;

		for(int i = 2; i <= 100; i = i + 2)
			sum = sum + i;

		System.out.println(sum);
	}
}
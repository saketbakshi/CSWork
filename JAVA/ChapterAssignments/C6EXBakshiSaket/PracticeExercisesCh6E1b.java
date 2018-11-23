/* Saket Bakshi. 11/21/18. Period 6
This program, for #1b of Ch 6, calculates the sum of squares between 1 and 100, inclusive.
*/
public class PracticeExercisesCh6E1b
{
	public static void main(String[] args)
	{
		double sum = 0;
		for(int i = 1; i <=100; i++)
			sum = sum + (Math.pow(i, 2));

		System.out.println((int)sum);
	}
}
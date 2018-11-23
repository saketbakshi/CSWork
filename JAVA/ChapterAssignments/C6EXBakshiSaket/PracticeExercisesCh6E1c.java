/* Saket Bakshi. 11/21/18. Period 6
This program, for #1c of Ch 6, calculates all the powers of 2 from 2^0 to 2^20.
*/
public class PracticeExercisesCh6E1c
{
	public static void main(String[] args)
	{
		for(int i = 0; i <= 20; i++)
			System.out.println((int)Math.pow(2, i));
	}
}
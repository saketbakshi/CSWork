/* Saket Bakshi. 11/21/18. Period 6
This program, for #1d of Ch 6, the sum of all odd numbers between a and b, inclusive, where a and b are inputs.
*/
import java.util.Scanner;

public class PracticeExercisesCh6E1d
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);

		System.out.println("I'll calculate the sum of all odd numbers between two integers you give.\nWhat are your numbers? ");
		
		int sum = 0;

		int a = key.nextInt();
		int b = key.nextInt();
		if(a % 2 == 0)
		{
			if(b % 2 == 0)
			{
				for(int i = a + 1; i < b; i = i + 2)
					sum = sum + i;
			}
			else
			{
				for(int j = a + 1; j <= b; j = j + 2)
					sum = sum + j;
			}
		}
		else
		{
			if(b % 2 == 0)
			{
				for(int k = a; k < b; k = k + 2)
					sum = sum + k;
			}
			else
			{
				for(int l = a; l <= b; l = l + 2)
					sum = sum + l;
			}
		}
		System.out.println(sum);
	}
}
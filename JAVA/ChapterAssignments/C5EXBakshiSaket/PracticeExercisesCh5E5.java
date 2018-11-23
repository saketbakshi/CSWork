/* Saket Bakshi. 10/25/18. Period 6
This program, for #5 of Ch 5, reads three numbers and tells if
they are in increasing, decreasing, or no order.
*/
import java.util.Scanner;

public class PracticeExercisesCh5E5
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);

		int first, second, third;

		System.out.println("What are your three numbers?"); //asks for three numbers
		first = key.nextInt();
		second = key.nextInt();
		third = key.nextInt();

		//replies with order analysis
		if(first < second && second < third)
			System.out.println("Your numbers are in increasing order.");
		else if(third < second && second < first)
			System.out.println("Your numbers are in decreasing order.");
		else
			System.out.println("Your numbers aren't in increasing or decreasing order.");
	}
}
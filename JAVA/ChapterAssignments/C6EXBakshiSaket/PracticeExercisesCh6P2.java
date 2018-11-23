/* Saket Bakshi. 11/21/18. Period 6
This program, for Project 2 of Ch 6, reads an integer n and prints the nth Fibonacci number.
*/
import java.util.Scanner;

public class PracticeExercisesCh6P2
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		int integer, answer = 0;
		int fold1 = 1;
		int fold2 = 1;

		System.out.println("What number do you want from the Fibonacci sequence?");

		integer = key.nextInt();

		for(int i = 1; i <= integer - 2; i++) //does a loop for integer - 2 times
		{
			int temp = 0;
			temp = fold1 + fold2; //makes a variable equal sum of the two previous numbers of the sequence
			fold1 = fold2; //makes the first number equal to the second
			fold2 = temp; //makes the second number equal to the sum
			answer = temp; //makes the answer equal to the current sum
		}
		System.out.println(answer);
	}
}
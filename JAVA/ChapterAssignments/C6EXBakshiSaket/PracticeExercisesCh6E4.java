/* Saket Bakshi. 11/21/18. Period 6
This program, for #4 of Ch 6, finishes the How To on page 276 of the textbook.
*/
import java.util.Scanner;

public class PracticeExercisesCh6E4
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);

		System.out.println("Please enter 12 temperatures for each month, in order:");
		double biggestTemperature = key.nextDouble();
		int counter = 1;
		int biggest = 0;
		for(int i = 2; i <=12; i++)
		{
			counter++;

			double temp = key.nextDouble();
			if(temp > biggestTemperature)
			{
				biggest = counter;
				biggestTemperature = temp;
			}

		}
		System.out.println("Month " + biggest + " out of 12 had the highest temperature.");
	}
}
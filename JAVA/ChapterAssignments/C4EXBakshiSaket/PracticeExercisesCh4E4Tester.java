/* Saket Bakshi. 10/15/18. Period 6
This program, for #4 of Ch 4, tests the class for calculating parameters about two inputted integers.
*/
import java.util.Scanner;

public class PracticeExercisesCh4E4Tester
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);

		System.out.print("Give me two integers: ");
		int first = key.nextInt();
		int second = key.nextInt(); //prompts user for numbers

		PracticeExercisesCh4E4 twoInts = new PracticeExercisesCh4E4(first, second);
		System.out.println();
		System.out.println("Here is information about your numbers:");
		System.out.println();

		System.out.printf("Sum: \t" + twoInts.getSum());
		System.out.println("");
		
		System.out.printf("Difference: \t" + twoInts.getDifference());
		System.out.println("");

		System.out.printf("Product: \t" + twoInts.getProduct());
		System.out.println("");

		System.out.printf("Average: \t" + twoInts.getAverage());
		System.out.println("");

		System.out.printf("Distance: \t" + twoInts.getDistance());
		System.out.println("");

		System.out.printf("Maximum: \t" + twoInts.getMax());
		System.out.println("");

		System.out.printf("Minimum: \t" + twoInts.getMin());
		System.out.println("");

		//gives out all calculated information on the numbers
	}
}

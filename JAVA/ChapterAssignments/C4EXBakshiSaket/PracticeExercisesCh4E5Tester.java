/* Saket Bakshi. 10/15/18. Period 6
This program, for #5 of Ch 4, tests the class for calculating parameters about two inputted integers. It prints results properly aligned.
*/
import java.util.Scanner;

public class PracticeExercisesCh4E5Tester
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

		System.out.printf("Sum: %15d", twoInts.getSum());
		System.out.println("");
		
		System.out.printf("Difference: %8d", twoInts.getDifference());
		System.out.println("");

		System.out.printf("Product: %11d", twoInts.getProduct());
		System.out.println("");

		System.out.printf("Average: %13.2f", twoInts.getAverage());
		System.out.println("");

		System.out.printf("Distance: %10d", twoInts.getDistance());
		System.out.println("");

		System.out.printf("Maximum: %11d", twoInts.getMax());
		System.out.println("");

		System.out.printf("Minimum: %11d", twoInts.getMin());
		System.out.println("");

		//gives out all calculated information on the numbers
	}
}

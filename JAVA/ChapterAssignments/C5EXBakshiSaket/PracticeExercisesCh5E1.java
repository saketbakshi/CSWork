/* Saket Bakshi. 10/25/18. Period 6
This program, for #1 of Ch 5, reads an integer and tells if it is positive,
negative, or zero.
*/
import java.util.Scanner;

public class PracticeExercisesCh5E1
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);

		int inputNumber;

		System.out.println("What's your number? "); //read in number
		inputNumber = key.nextInt();

		//tell if positive, negative, or 0
		if(inputNumber == 0)
			System.out.println("Your number is 0.");
		else if(inputNumber < 0)
			System.out.println("Your number is negative.");
		else if(inputNumber > 0)
			System.out.println("Your number is positive.");
	}
}
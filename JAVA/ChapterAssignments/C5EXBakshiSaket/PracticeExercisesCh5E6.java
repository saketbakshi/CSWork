/* Saket Bakshi. 10/25/18. Period 6
This program, for #6 of Ch 5, reads three numbers and tells if
they are in increasing, decreasing, or no order. It also asks if order decisions should be strict or lenient, in that if 
two numbers in a row are equal, strict would take away order denominations and lenient would let it go.
*/
import java.util.Scanner;

public class PracticeExercisesCh5E6
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);

		int first, second, third;

		System.out.println("What are your three numbers?"); //asks for three numbers
		first = key.nextInt();
		second = key.nextInt();
		third = key.nextInt();

		String reply;
	
		System.out.println("Do you want to be strict or lenient?");
		reply = key.next();
		
		if(!reply.equals("strict") && !reply.equals("lenient"))
		{
			do
			{
				System.out.println("Sorry, I didn't understand your reply. (Please reply with \"strict\" or \"lenient\")");
				reply = key.next();	
			} while(!reply.equals("strict") && !reply.equals("lenient"));
		}


		if(reply.equals("strict"))
		{
			//replies with order analysis
			if(first < second && second < third)
				System.out.println("Your numbers are in increasing order.");
			else if(third < second && second < first)
				System.out.println("Your numbers are in decreasing order.");
			else
				System.out.println("Your numbers aren't in increasing or decreasing order.");
		}
		else if(reply.equals("lenient"))
		{
			if((first <= second && second < third) || (first < second && second <= third))
				System.out.println("Your numbers are in increasing order.");
			else if((first >= second && second > third) || (first > second && second >= third))
				System.out.println("Your numbers are in decreasing order.");
			else
				System.out.println("Your numbers aren't in increasing or decreasing order.");	
		}
	}
}
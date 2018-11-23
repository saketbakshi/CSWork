/* Saket Bakshi. 11/21/18. Period 6
This program, for #10 of Ch 6, reads and prints the number of vowels in a word, with "aeiouy" considered vowels.
*/
import java.util.Scanner;

public class PracticeExercisesCh6E10
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		System.out.println("Give me a word. I'll tell you how many vowels are in it.");
		String input = key.next();
		String word = input.toLowerCase();

		int counter = 0;
		for(int i = 0; i < word.length(); i++)
		{
			String temp = word.substring(i, i + 1);
			if(temp.equals("a") || temp.equals("e") || temp.equals("i") || temp.equals("o") || temp.equals("u") || temp.equals("y"))
				counter++;
		}
		System.out.println("There are " + counter + " vowels in " + input + ".");
	}
}
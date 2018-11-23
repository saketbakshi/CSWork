import java.util.Scanner;

public class CBT013BakshiSaket
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		String word;
		boolean yep, nope;

		System.out.println("Type the word \"weasel\", please.");
		word = input.next();

		yep = word.equals("weasel");
		nope = !word.equals("weasel");

		System.out.println("You typed what was requested: " + yep);
		System.out.println("You ignored polite instructions: "+ nope);
	}
}
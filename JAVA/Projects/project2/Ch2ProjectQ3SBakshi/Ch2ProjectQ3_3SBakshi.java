import java.util.StringTokenizer;

public class Ch2ProjectQ3_3SBakshi
{
	public static void main(String[] args)
	{
		String sentence = "Mary had a little lamb.";
		StringTokenizer mystery = new StringTokenizer(sentence);
		System.out.println(mystery.countTokens());
		System.out.println(mystery.nextToken());
		System.out.println(mystery.nextToken());

		//This program prints the number of words on the first line, the first word on the second line, and the following word on the third line.
	}
}
public class Ch2ProjectQ2_4SBakshi
{
	public static void main(String[] args)
	{
		String sentence1 = "      abc   ";
		String sentence2 = "   def";
		String sentence3 = "ghi         ";

		String message = sentence1.trim().concat(sentence2.trim().concat(sentence3.trim()));
		
		System.out.println(message);
	}
}
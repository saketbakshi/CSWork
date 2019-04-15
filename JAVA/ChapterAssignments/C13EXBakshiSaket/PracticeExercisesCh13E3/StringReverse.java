/**
	Saket Bakshi. 4/7/19. Period 6. This is used for problem 3 of Chapter 13.
	Reverses a string recursively.
*/
public class StringReverse
{
	public static void main(String[] args)
	{
		System.out.println("First string: \"Hello!\"");
		System.out.println("\nResults: \"" + reverse("Hello!") + "\"");
		System.out.println("Expected: \"!olleH\"");
	}

	/**
		Reverses the order of a String, recursively.
		@param text the String to reverse
		@return the reversed String
	*/
	public static String reverse(String text)
	{
		if(text.length() == 1)
			return text;
		else
			return reverse(text.substring(1)) + text.substring(0,1);
	}
}